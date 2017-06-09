package com.estaine.fareseer.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class WizzAirResponse implements Response {

    private static final String BASIC_FARE = "BASIC";

    private List<Flight> outboundFlights;

    @Override
    public Set<SimpleResponse> process() {
        Set<SimpleResponse> simpleResponseSet = new HashSet<>();
        for (Flight flight : outboundFlights) {
            SimpleResponse simpleResponse = new SimpleResponse();
            simpleResponse.setFromAirportCode(flight.getDepartureStation());
            simpleResponse.setToAirportCode(flight.getArrivalStation());
            simpleResponse.setDepartureDateTime(flight.getDepartureDateTime());
            simpleResponse.setArrivalDateTime(flight.getArrivalDateTime());
            simpleResponse.setAirlineCode(flight.getCarrierCode());
            simpleResponse.setFlightNumber(flight.getFlightNumber());

            Flight.Fare baseFare = flight.getFares().stream()
                    .filter(fare -> BASIC_FARE.equals(fare.getBundle()))
                    .findFirst().orElseThrow(ResponseParsingException::new);

            simpleResponse.setPrice(baseFare.getBasePrice().getAmount());
            simpleResponse.setCurrencyCode(baseFare.getBasePrice().getCurrencyCode());

            simpleResponseSet.add(simpleResponse);
        }

        return simpleResponseSet;
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Flight {

        private String departureStation;
        private String arrivalStation;
        private String carrierCode;
        private String flightNumber;
        private String departureDateTime;
        private String arrivalDateTime;
        private List<Fare> fares;

        @Data
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Fare {

            private Price basePrice;
            private String bundle;

            @Data
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Price {

                private double amount;
                private String currencyCode;
            }
        }
    }
}
