package com.example.stayhotel.controller;

import com.example.stayhotel.entity.Clients;
import com.example.stayhotel.repo.ClientsRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class ClientController {
    private final ClientsRepo clientsRepo;

    public ClientController(ClientsRepo clientsRepo) {
        this.clientsRepo = clientsRepo;
    }

    @PostMapping("/clients")
    public ResponseEntity<Clients> save(@RequestBody Clients clients) {
        try {
            return new ResponseEntity<>(clientsRepo.save(clients), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/clients")
    public ResponseEntity<List<Clients>> getAllClients() {
        try {
            List<Clients> list = (List<Clients>) clientsRepo.findAll();
            if (list.isEmpty() || list.size() == 0) {
                return new ResponseEntity<List<Clients>>(HttpStatus.NO_CONTENT);

            }
            return new ResponseEntity<List<Clients>>(list, HttpStatus.OK);
        } catch (Exception e) {

            return new ResponseEntity<List<Clients>>((List<Clients>) null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/client/{id}")
    public ResponseEntity<Clients>updateClients(@RequestBody Clients Clients) {

        try {
            return new ResponseEntity<Clients>(clientsRepo.save(Clients), HttpStatus.OK);
        } catch (Exception E) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @DeleteMapping("/clients/{id}")
    public ResponseEntity<HttpStatus>deleteClients(@PathVariable Long id ) {

        try {
            Optional<Clients> clients = clientsRepo.findById(id);
            clients.ifPresent(clientsRepo::delete);
            return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);

        } catch (Exception e) {
            return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }}