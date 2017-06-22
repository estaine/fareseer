package com.estaine.fareseer.controller;

import com.estaine.fareseer.request.SimpleRequest;
import com.estaine.fareseer.request.WizzAirRequester;
import com.estaine.fareseer.response.SimpleResponse;
import java.io.IOException;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class FareController {

    @Autowired
    WizzAirRequester wizzAirRequester;

    @RequestMapping("/fare")
    public Set<SimpleResponse> getFare() throws IOException {
        SimpleRequest request = new SimpleRequest("LTN", "VNO", "2017-07-18");
        return wizzAirRequester.sendRequest(request);
    }
}
