package service;

import entity.ServicePv;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface ServicePvRepo extends CrudRepository<ServicePv,Long> {

}
