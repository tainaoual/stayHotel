package com.example.stayhotel.entity;


import lombok.*;

import javax.persistence.*;

@Table(name = "client")
@Entity
@Setter
@Getter
@ToString

@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Clients {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "address")
    private String address;
    @Column(name = "age")
    private String age;
    @Column(name = "data")
    private String data;
//    private Object Clients;



    public Clients(String name,String lastName,String address,String age, String data) {
}


}
