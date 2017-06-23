package com.estaine.fareseer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Connection {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Airline airline;

    @ManyToOne
    private Airport firstAirport;

    @ManyToOne
    private Airport secondAirport;
}
