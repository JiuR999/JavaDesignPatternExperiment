package cn.swust.lab3.utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonDataLoader<T> {
    public List<T> loadDatasFromJson(String filePath, TypeReference<List<T>> typeReference){
        File jsonFile = new File(filePath);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);

        try {
            List<T> datas = objectMapper.readValue(jsonFile, typeReference);
            return datas;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
