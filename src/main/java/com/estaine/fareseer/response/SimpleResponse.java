package com.estaine.fareseer.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SimpleResponse {

    private String fromAirportCode;
    private String toAirportCode;
    private String departureDateTime;
    private String arrivalDateTime;
    private String airlineCode;
    private String flightNumber;
    private double price;
    private String currencyCode;

}
