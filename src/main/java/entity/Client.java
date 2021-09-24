package entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
    public class Client {
        @Id
        @GeneratedValue
        private Long id;

        private String name;

        private String lastName;

        private String address;
        private String age;
        private String data;

        protected Client(){

        }
}
