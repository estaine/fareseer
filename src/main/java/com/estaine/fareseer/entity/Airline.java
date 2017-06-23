package com.estaine.fareseer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Airline {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Column(name = "iata_code", columnDefinition = "char(2)")
    private String iataCode;
}
