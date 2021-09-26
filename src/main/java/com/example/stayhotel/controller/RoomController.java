package com.example.stayhotel.controller;


import com.example.stayhotel.entity.Hotel;
import com.example.stayhotel.entity.Room;
import com.example.stayhotel.entity.ServicePv;
import com.example.stayhotel.repo.ClientRepo;
import com.example.stayhotel.repo.HotelRepo;
import com.example.stayhotel.repo.RoomRepo;
import com.example.stayhotel.repo.ServicePvRepo;
import com.example.stayhotel.service.RoomService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;




    @RestController
    public class RoomController {
        private RoomService roomService;
        private RoomRepo roomRepo;
        private HotelRepo hotelRepo;
        private ClientRepo clientRepo;
        private ServicePvRepo servicePvRepo;

        public RoomController(RoomService roomService,RoomRepo roomRepo, ServicePvRepo servicePvRepo, ClientRepo clientRepo, HotelRepo hotelRepo) {
            this.roomService = roomService;
            this.hotelRepo = hotelRepo;
            this.clientRepo = clientRepo;
            this.servicePvRepo = servicePvRepo;
            this.roomRepo = roomRepo;
        }

        @GetMapping("/api/rooms")
        public Iterable<Room> retrieveAllRooms() {
            return roomService.retrieveAllRooms();
        }

        @GetMapping("/api/hotels")
        public Iterable<Hotel> retrieveAllHotels() {
            return hotelRepo.findAll();
        }

        @GetMapping("/api/rooms/{id}")
        public Room retrieveRoomsById(@PathVariable Long id){
            return roomService.retrievedRoomById(id);
        }

        @GetMapping("/api/rooms/hotel/{id}")
        public Iterable<Room> retrieveRoomsByHotelId(@PathVariable Long id){
            return roomService.retrieveRoomsFromHotelById(id);
        }
        @PostMapping("/hotels")
        public ResponseEntity<Hotel> save(@RequestBody Hotel hotel) {
            try {
                return new ResponseEntity<>(hotelRepo.save(hotel), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
        @PostMapping("/rooms")
        public ResponseEntity<Room> save(@RequestBody Room room) {
            try {
                return new ResponseEntity<>(roomRepo.save(room), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        @PostMapping("/servicePv")
        public ResponseEntity<ServicePv> save(@RequestBody ServicePv servicePv) {
            try {
                return new ResponseEntity<>(servicePvRepo.save(servicePv), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
        @PostMapping("/api/rooms/hotel/{id}")
        public  Iterable<Room> addRoom(@RequestBody Room roomToAdd, @PathVariable Long id){
            hotelRepo.save(roomToAdd.getHotel());
            servicePvRepo.save(roomToAdd.getServicePv());
            clientRepo.save(roomToAdd.getClients());
            roomService.saveRoom(roomToAdd);
            System.out.println(id);
            return roomService.retrieveRoomsFromHotelById(id);
        }
        @PutMapping("/api/rooms")
        public Iterable<Room> editRoom(@RequestBody Room roomToEdit){
            if(roomToEdit.getId()!= null){
                hotelRepo.save(roomToEdit.getHotel());
                servicePvRepo.save(roomToEdit.getServicePv());
                clientRepo.save(roomToEdit.getClients());
                roomService.saveRoom((roomToEdit));
            }
            return roomService.retrieveAllRooms();
        }




        @DeleteMapping("/api/rooms/{id}")
        public Iterable<Room> deleteRoomById(@PathVariable Long id){
            Room room = roomService.retrievedRoomById(id);
            roomService.deleteRoomById(id);
            Hotel hotel = hotelRepo.findById(room.getHotel().getId()).get();
            return hotel.getRooms();
        }

        @GetMapping("/api/hotel/{id}")
        public Hotel retrieveHotelById(@PathVariable Long id){
            return hotelRepo.findById(id).get();
        }
    }


