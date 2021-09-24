package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ServicePv {
        @Id
        @GeneratedValue
        private Long id;

        private String servicePvId;
        private String servicePvId1;
        private String servicePvId2;
        private String servicePvId3;
        private String dateAndTime;
        protected ServicePv(){
        }
}
