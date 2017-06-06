package com.estaine.fareseer.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SimpleRequest {

    private String fromAirportCode;
    private String toAirportCode;
    private String date;


}
