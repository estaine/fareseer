package com.estaine.fareseer.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lombok.Data;

@Data
public class WizzAirRequest extends Request {

    private List<FlightList> flightList;

    private int adultCount;

    private int childCount;

    private int infantCount;

    private boolean wdc;

    private String rescueFareCode;

    @JsonProperty("isFlightChange")
    private boolean flightChange;

    public WizzAirRequest(SimpleRequest request) {
        flightList = Collections.singletonList(new FlightList(request));
        adultCount = 1;
        childCount = 0;
        infantCount = 0;
        wdc = false;
        rescueFareCode = "";
        flightChange = false;
    }

    @Data
    public class FlightList {
        private String departureStation;
        private String arrivalStation;
        private String departureDate;

        public FlightList(SimpleRequest request) {
            this.departureStation = request.getFromAirportCode();
            this.arrivalStation = request.getToAirportCode();
            this.departureDate = request.getDate();
        }
    }
};