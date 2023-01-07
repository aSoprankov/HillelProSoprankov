package soprankov.service.impl;

import soprankov.service.ConverterService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.util.Map;

public class YamlConverterServiceImpl implements ConverterService {
    @Override
    public String convert(String data) {
        try {
            Map[] map = new Yaml(new Constructor(Map[].class)).load(data);
            return new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(map);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
