package com.example.stayhotel.repo;

import com.example.stayhotel.entity.Clients;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClientsRepo extends CrudRepository<Clients,Long> {


//    Iterable<Clients> findByClientsId(Long clientsId);

}