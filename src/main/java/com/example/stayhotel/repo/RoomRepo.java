package com.example.stayhotel.service;


import com.example.stayhotel.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepo extends CrudRepository<Room,Long> {

    Iterable<Room> findByHotelId(Long hotelId);
}
