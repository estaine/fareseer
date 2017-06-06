package com.estaine.fareseer.request;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class Request {
    protected final static ObjectMapper MAPPER = new ObjectMapper();

    public String toJSON() {
        try {
            return MAPPER.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            System.out.println("Oi");
        }

        return "";
    }
}
