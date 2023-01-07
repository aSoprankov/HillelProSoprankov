package soprankov.service;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.nio.file.Path;

public interface ConverterService {
    String convert(String data) throws JsonProcessingException;
}
