package com.soprankov.service.impl;

import com.soprankov.service.FileService;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Stream;

public class FileServiceImpl implements FileService {
    @Override
    public List<File> getFilesPath(Path path) {
        File file = new File(String.valueOf(path));
        List<File> listFiles = new ArrayList<>();

        if (file.isDirectory()) {
            listFiles = Arrays.asList(Objects.requireNonNull(path.toFile().listFiles()));
        }

        return getFileValidPath(listFiles, List.of("json", "yaml"));
    }

    @Override
    public void writeToFile(File file, boolean append, String data) throws IOException {

        if (!file.exists()) {
            file.createNewFile();
        }

        OutputStream outputStream = new FileOutputStream(file, append);
        outputStream.write(data.getBytes(StandardCharsets.UTF_8));
        outputStream.close();
    }

    @Override
    public String readFromFile(Path path) {
        StringBuilder stringBuilder = new StringBuilder();

        try (Stream<String> stream = Files.lines(path, StandardCharsets.UTF_8)) {
            stream.forEach(s -> stringBuilder.append(s).append("\n"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return stringBuilder.toString();
    }
    @Override
    public boolean isFileFormat(File file, String extension) {
        return file.getName().toLowerCase().endsWith(extension.toLowerCase());
    }

    @Override
    public String getFileName(File file) {
        return file.getName().split("\\.")[0];
    }

    private List<File> getFileValidPath(List<File> filePath, List<String> extensions) {
        List<File> fileValidPath = new ArrayList<>();

        for (File file : filePath) {
            for (String extension : extensions) {
                if (file.getName().toLowerCase().endsWith(extension.toLowerCase())) {
                    fileValidPath.add(file);
                }
            }
        }
        return fileValidPath;
    }
}
