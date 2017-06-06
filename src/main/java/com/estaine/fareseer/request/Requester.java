package com.estaine.fareseer.request;

import com.estaine.fareseer.response.Response;
import com.estaine.fareseer.response.SimpleResponse;
import java.io.IOException;

public abstract class Requester<T extends Request, R extends Response> {

    public abstract SimpleResponse sendRequest(SimpleRequest request) throws IOException;

    protected abstract T buildRequest(SimpleRequest simpleRequest);

    protected SimpleResponse processResponse(R response) {
        return response.process();
    }
}
