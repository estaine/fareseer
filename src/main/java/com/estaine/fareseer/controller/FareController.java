package com.estaine.fareseer.controller;

import com.estaine.fareseer.request.SimpleRequest;
import com.estaine.fareseer.request.WizzAirRequester;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class FareController {

    @Autowired
    WizzAirRequester wizzAirRequester;

    @RequestMapping("/fare")
    public void getFare() throws IOException {
        SimpleRequest request = new SimpleRequest("SOF", "CPH", "2017-06-17");
        wizzAirRequester.sendRequest(request);
    }
}
