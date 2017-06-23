package com.estaine.fareseer.connection;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@EnableScheduling
@Component
public class WizzAirConnectionLoader implements ConnectionLoader {

    private final static String CONNECTIONS_URL = "https://be.wizzair.com/5.3.0/Api/asset/map?languageCode=en-gb";

    @Override
    @Scheduled(initialDelay = 1000, fixedDelay = 1_000_000)
    public void updateConnections() {

    }

    private void x() {

    }

}
