package com.soprankov.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public interface FileService {
    List<File> getFilesPath(Path path) throws IOException;

    void writeToFile(File file, boolean append, String data) throws IOException;

    String readFromFile(Path path);

    boolean isFileFormat(File file, String extension);

    String getFileName(File file);
}
