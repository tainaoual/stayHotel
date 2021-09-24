package service;

import entity.Clients;
import org.springframework.data.repository.CrudRepository;


public interface ClientRepo extends CrudRepository<Clients,Long> {
}
