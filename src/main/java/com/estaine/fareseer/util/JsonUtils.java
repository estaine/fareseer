package com.estaine.fareseer.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class JsonUtils {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    public static String toJSON(Object object) {
        try {
            return MAPPER.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            System.out.println("Oi blet");
            return "";
        }
    }

    public static <T> T fromJSON(String json, Class<T> type) {
        try {
            return MAPPER.readValue(json, type);
        } catch (IOException e) {
            System.out.println("Nu suka");
            return null;
        }
    }
}
