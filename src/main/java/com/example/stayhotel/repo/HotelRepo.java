package com.example.stayhotel.repo;


import com.example.stayhotel.entity.Hotel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepo extends CrudRepository<Hotel,Long> {
}
