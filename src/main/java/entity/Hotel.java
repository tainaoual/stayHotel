package entity;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

@Entity
public class  Hotel {
    @Id
    @GeneratedValue
    private long id;
    @JsonIgnore
    @OneToMany(mappedBy = "hotel", orphanRemoval = true)
    private List<Room> rooms = Collections.EMPTY_LIST;
    private String name;
    @Embedded
    private Coordinates coordinates;

    protected Hotel() {
    }
}