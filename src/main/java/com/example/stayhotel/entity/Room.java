package com.example.stayhotel.entity;


import lombok.*;

import javax.persistence.*;


@Table(name = "room")
@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Hotel hotel;
    @Column(name = "owner")

    private String roomId;
    @Column(name = "name")

    private String owner;
    @Column(name = "condition")


    private String condition;

    @Column(name = "location")
    private String location;


    @OneToOne
    private Clients clients;

    @Column(name = "History")
    private String History;

    @Column(name = "floor")
    private String floor;

    @Column(name = "smokeLevel")
    private String smokeLevel;

    @Column(name = "summary")
    private String summary;


    @OneToOne
    private ServicePv servicePv;


}
