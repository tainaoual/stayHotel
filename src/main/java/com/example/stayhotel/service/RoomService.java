package com.example.stayhotel.service;


import com.example.stayhotel.entity.Room;
import com.example.stayhotel.repo.HotelRepo;
import com.example.stayhotel.repo.RoomRepo;
import org.springframework.stereotype.Service;

@Service
public class RoomService {


        private RoomRepo roomRepo;
        private HotelRepo hotelRepo;

        public RoomService(RoomRepo roomRepo,HotelRepo hotelRepo) {
            this.roomRepo = roomRepo;
            this.hotelRepo = hotelRepo;
        }
        public Room retrievedRoomById(Long id){
            return roomRepo.findById(id).get();
        }
        public Iterable<Room> retrieveAllRooms(){
            return roomRepo.findAll();
        }
        public void saveRoom(Room roomToSave){
            roomRepo.save(roomToSave);
        }
        public void deleteRoomById(Long id){
            roomRepo.deleteById(id);
        }
        public Iterable<Room> retrieveRoomsFromHotelById(Long hotelId){
            return roomRepo.findByHotelId(hotelId);
        }

    }


