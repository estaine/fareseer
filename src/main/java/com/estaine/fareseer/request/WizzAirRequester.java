package com.estaine.fareseer.request;

import com.estaine.fareseer.response.SimpleResponse;
import com.estaine.fareseer.response.WizzAirResponse;
import com.estaine.fareseer.util.JsonUtils;
import java.io.IOException;
import java.util.Set;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Component;

@Component
public class WizzAirRequester extends Requester<WizzAirRequest, WizzAirResponse> {
    private static final String URL = "https://be.wizzair.com/5.1.4/Api/search/search";

    @Override
    public Set<SimpleResponse> sendRequest(SimpleRequest request) throws IOException {
        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpPost httpPost = new HttpPost(URL);
        StringEntity requestEntity = new StringEntity(buildRequest(request).toJSON());
        requestEntity.setContentType("application/json");
        requestEntity.setContentEncoding("UTF-8");
        httpPost.addHeader("content-type", "application/json");
        httpPost.setEntity(requestEntity);
        HttpResponse httpResponse = httpClient.execute(httpPost);
        WizzAirResponse wizzAirResponse = JsonUtils.fromJSON(EntityUtils.toString(httpResponse.getEntity()), WizzAirResponse.class);
        return wizzAirResponse.process();
    }

    @Override
    protected WizzAirRequest buildRequest(SimpleRequest simpleRequest) {
        return new WizzAirRequest(simpleRequest);
    }
}
