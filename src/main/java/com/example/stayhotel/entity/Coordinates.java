package entity;


import javax.persistence.Embeddable;

@Embeddable
    public class Coordinates {
//    @Id
//    @GeneratedValue
//    private Long id;

        private double longitude;
        private double latitude;

        public Coordinates(){}
}
