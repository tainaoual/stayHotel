package entity;

import lombok.*;

import javax.persistence.*;


@Table(name="servicePv")
@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ServicePv {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(name="branservicePvId")
        private String servicePvId;
        @Column(name="servicePvId1")
        private String servicePvId1;
        @Column(name="servicePvId2")
        private String servicePvId2;


}
