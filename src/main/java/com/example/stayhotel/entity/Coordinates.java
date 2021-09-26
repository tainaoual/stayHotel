package com.example.stayhotel.entity;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Embeddable;
@Setter
@Getter
@ToString
@EqualsAndHashCode
@Embeddable
    public class Coordinates {
//    @Id
//    @GeneratedValue
//    private Long id;

        private double longitude;
        private double latitude;

    public Coordinates(double v, double longitude, double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public Coordinates(){}
}
