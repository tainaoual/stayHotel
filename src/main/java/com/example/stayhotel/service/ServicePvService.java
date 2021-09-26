package com.example.stayhotel.service;

import com.example.stayhotel.entity.ServicePv;
import com.example.stayhotel.repo.ServicePvRepo;
import org.springframework.stereotype.Service;

@Service
public class ServicePvService {

    private ServicePvRepo servicePvRepo;

    public ServicePvService(ServicePvRepo servicePvRepo) {
        this.servicePvRepo = servicePvRepo;
    }


    public void saveServicePv(ServicePv servicePv) {
        servicePvRepo.save(servicePv);
    }
}
