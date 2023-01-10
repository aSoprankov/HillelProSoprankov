package com.soprankov.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.soprankov.service.ConverterService;
import com.soprankov.service.exeption.JsonConversionFailed;
import org.yaml.snakeyaml.Yaml;

import java.util.Map;

public class JsonConverterServiceImpl implements ConverterService {
    @Override
    public String convert(String data) {
        try {
            return new Yaml().dump(new ObjectMapper().readValue(data, Map[].class));
        } catch (JsonProcessingException exception) {
            throw new JsonConversionFailed();
        }
    }
}
