package com.estaine.fareseer.request;

import com.estaine.fareseer.util.JsonUtils;
import com.fasterxml.jackson.core.JsonProcessingException;

public abstract class Request {

    public String toJSON() {
        return JsonUtils.toJSON(this);
    }
}
