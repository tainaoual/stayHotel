package entity;


import javax.persistence.*;

@Entity
    public class Room {
        @Id
        @GeneratedValue
        private Long id;
        @ManyToOne
        private Hotel hotel;
        private String roomId;
        private String owner;

        private String condition;
        private String location;
        @OneToOne
        private Client client;
        private String History;
        private String floor;
        private String smokeLevel;
        private String summary;
        @OneToOne
        private ServicePv servicePv;

        protected Room() {
        }
}
