package com.soprankov;

import com.soprankov.service.impl.FileServiceImpl;
import com.soprankov.service.impl.JsonConverterServiceImpl;
import com.soprankov.service.impl.YamlConverterServiceImpl;
import com.soprankov.service.ConverterService;
import com.soprankov.service.FileService;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class ConverterRunner {
    private static final String YAML = "yaml";
    private static final String JSON = "json";
    private static final FileService FILE_SERVICE = new FileServiceImpl();

    public static void main(String[] args) throws IOException {
        Path path = Path.of(System.getProperty("user.dir"));

        if (args.length > 0) {
            path = Path.of(args[0]);
        }

        action(path);
    }

    private static void action(Path path) throws IOException {
        List<File> filesList = FILE_SERVICE.getFilesPath(path);
        File fileDir = new File(path.toString(), "/result");
        fileDir.mkdir();

        for (File file : filesList) {
            ConverterService converterService;
            long start = System.nanoTime();
            String string;
            String log = "[CONVERSION-IS-NOT-POSSIBLE]";
            long sizeFile = Files.size(file.toPath());

            if (FILE_SERVICE.isFileFormat(file, YAML)) {
                converterService = new YamlConverterServiceImpl();
                string = converterService.convert(FILE_SERVICE.readFromFile(file.toPath()));
                File destinationFile = new File(fileDir,FILE_SERVICE.getFileName(file) + ".json");
                System.out.println("convert yaml -> json done");

                FILE_SERVICE.writeToFile(destinationFile, false, string);
                log = createLog(file, destinationFile, start, sizeFile);

            } else if (FILE_SERVICE.isFileFormat(file, JSON)) {
                converterService = new JsonConverterServiceImpl();
                string = converterService.convert(FILE_SERVICE.readFromFile(file.toPath()));
                File destinationFile = new File(fileDir, FILE_SERVICE.getFileName(file) + ".yaml");
                System.out.println("convert json -> yaml done");

                FILE_SERVICE.writeToFile(destinationFile, false, string);
                log = createLog(file, destinationFile, start, sizeFile);
            }

            FILE_SERVICE.writeToFile(new File(fileDir, "log.txt"), true, log);
        }
    }

    private static String createLog(File file, File destinationFile, long start, long sizeFile) {
        return "DATA:".concat(String.valueOf(LocalDateTime.now()))
                .concat("--FROM:").concat(file.getName())
                .concat("--TO:").concat(destinationFile.getName())
                .concat("--TIME:").concat(Long.toString(System.nanoTime() - start))
                .concat("--FILE_SIZE:").concat(String.valueOf(sizeFile))
                .concat("\n");
    }
}
