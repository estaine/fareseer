package com.estaine.fareseer.entity;

import java.util.List;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import lombok.Data;

@Entity
@Data
public class Airport {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "iata_code", columnDefinition = "char(3)")
    private String iataCode;

    private String name;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "airport_alias", joinColumns = @JoinColumn(name = "airport_id"))
    @Column(name = "alias")
    private List<String> aliases;

    private String city;

    private String country;

    private String timezone;
}
