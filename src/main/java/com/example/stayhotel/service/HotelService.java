package service;


import entity.Hotel;
import org.springframework.stereotype.Service;

@Service
    public class HotelService {

        private HotelRepo hotelRepo;

        public HotelService(HotelRepo hotelRepo) {
            this.hotelRepo = hotelRepo;
        }

        public Hotel retrieveRoomByHotelId(Long id) {
            return hotelRepo.findById(id).get();
        }
    }



