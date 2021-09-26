package com.example.stayhotel.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

@Table(name="stay")
@Entity
@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class  Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @JsonIgnore
    @OneToMany(mappedBy = "hotel", orphanRemoval = true)
    private List<Room> rooms = Collections.EMPTY_LIST;
    @Column(name = "name")
    private String name;
    @Embedded
    private Coordinates coordinates;

    public Hotel(long id, String name, Coordinates coordinates) {
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
    }
}