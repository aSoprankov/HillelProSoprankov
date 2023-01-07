package soprankov;

import soprankov.service.impl.FileServiceImpl;
import soprankov.service.impl.JsonConverterServiceImpl;
import soprankov.service.impl.YamlConverterServiceImpl;
import soprankov.service.ConverterService;
import soprankov.service.FileService;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.List;

public class ConverterRunner {
    private static final String YAML = "yaml";
    private static final String JSON = "json";
    private static final FileService FILE_SERVICE = new FileServiceImpl();

    public static void main(String[] args) throws IOException {
        Path path = Path.of(System.getProperty("user.dir"));

        if (args.length > 0) {
            path = Path.of(args[0]);
        }

        List<File> filesList = FILE_SERVICE.getFilesPath(path);
        File fileDir = new File(path.toString(), "/result");
        fileDir.mkdir();

        for (File file : filesList) {
            ConverterService converterService;
            long start = System.nanoTime();
            String string = "";
            File destinationFile = new File(fileDir, "file.txt");

            if (FILE_SERVICE.isFileFormat(file, YAML)) {
                converterService = new YamlConverterServiceImpl();
                string = converterService.convert(FILE_SERVICE.readFromFile(file.toPath()));
                destinationFile = new File(fileDir, FILE_SERVICE.getFileName(file) + ".json");
            } else if (FILE_SERVICE.isFileFormat(file, JSON)) {
                converterService = new JsonConverterServiceImpl();
                string = converterService.convert(FILE_SERVICE.readFromFile(file.toPath()));
                destinationFile = new File(fileDir, FILE_SERVICE.getFileName(file) + ".yaml");
            }

            FILE_SERVICE.writeToFile(destinationFile, false, string);

            String log = String.valueOf(LocalDateTime.now())
                    .concat("--FROM:").concat(file.getName())
                    .concat("--TO:").concat(destinationFile.getName())
                    .concat("--TIME:").concat(Long.toString(System.nanoTime() - start))
                    .concat("\n");

            FILE_SERVICE.writeToFile(new File(fileDir, "log.txt"), true, log);
        }
    }
}
