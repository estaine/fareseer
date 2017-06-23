package com.estaine.fareseer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Currency {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "iso_code", columnDefinition = "char(3)")
    private String isoCode;

    private String name;
}
