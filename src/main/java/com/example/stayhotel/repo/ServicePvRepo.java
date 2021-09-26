package com.example.stayhotel.repo;

import com.example.stayhotel.entity.ServicePv;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicePvRepo extends CrudRepository<ServicePv,Long> {

}
