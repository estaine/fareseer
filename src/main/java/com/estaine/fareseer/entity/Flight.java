package com.estaine.fareseer.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Flight {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Airport airportFrom;

    @ManyToOne
    private Airport airportTo;

    @ManyToOne
    private Airline airline;

    private Integer number;

    @Column(name = "departure_time_utc")
    private Date departureTimeUTC;

    @Column(name = "arrival_time_utc")
    private Date arrivalTimeUTC;

    private Double fare;

    @ManyToOne
    private Currency currency;
}
