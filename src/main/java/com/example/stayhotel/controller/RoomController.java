package controller;

import entity.Hotel;
import entity.Room;
import org.springframework.web.bind.annotation.*;
import service.*;




    @RestController
    public class RoomController {
        private RoomService roomService;
        private HotelRepo hotelRepo;
        private  ClientRepo clientRepo;
        private ServicePvRepo servicePvRepo;

        public RoomController(RoomService roomService, ServicePvRepo servicePvRepo, ClientRepo clientRepo, HotelRepo hotelRepo) {
            this.roomService = roomService;
            this.hotelRepo = hotelRepo;
            this.clientRepo = clientRepo;
            this.servicePvRepo = servicePvRepo;
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
        public Hotel retrieveHtellById(@PathVariable Long id){
            return hotelRepo.findById(id).get();
        }
    }


