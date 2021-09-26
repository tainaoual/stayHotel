

package com.example.stayhotel.service;

import com.example.stayhotel.entity.Clients;
import com.example.stayhotel.repo.ClientsRepo;
import org.springframework.stereotype.Service;


@Service
public class ClientsService {

    private ClientsRepo clientsRepo;

    public ClientsService(ClientsRepo clientsRepo) {
        this.clientsRepo = clientsRepo;
    }

    public void saveClients(Clients Clients) {
        clientsRepo.save(Clients);

//public Clients retrievedClientsById(Long id){
//    return clientsRepo.findById(id).get();
//}
//    public Iterable<Clients> retrieveAllClients(){
//        return clientsRepo.findAll();
//    }
//    public void saveClients(Clients clientsToSave){
//        clientsRepo.save(clientsToSave);
//    }
//    public void deleteClientsById(Long id){
//        clientsRepo.deleteById(id);
//    }
//    public Iterable<Clients> retrieveClientsFromHotelById(Long ClientsId){
//        return clientsRepo.findByClientsId(ClientsId);
    }

}

