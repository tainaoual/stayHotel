package com.example.stayhotel;

import com.example.stayhotel.entity.*;
import com.example.stayhotel.repo.ClientsRepo;
import com.example.stayhotel.repo.HotelRepo;
import com.example.stayhotel.repo.RoomRepo;
import com.example.stayhotel.repo.ServicePvRepo;
import com.example.stayhotel.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Populator implements CommandLineRunner {

        private RoomService roomService;
        private RoomRepo roomRepo;
        private HotelRepo hotelRepo;
        private ClientsRepo clientsRepo;
        private ServicePvRepo servicePvRepo;
        private HotelService hotelService;
        private ClientsService clientsService;
        private ServicePvService servicePvService;

    public Populator(RoomService roomService, RoomRepo roomRepo, ServicePvService servicePvService, HotelRepo hotelRepo, ClientsRepo clientsRepo, ServicePvRepo servicePvRepo, HotelService hotelService,ClientsService clientsService) {
        this.roomService = roomService;
        this.roomRepo = roomRepo;
        this.hotelRepo = hotelRepo;
        this.clientsRepo = clientsRepo;
        this.servicePvRepo = servicePvRepo;
        this.hotelService = hotelService;
   this.clientsService = clientsService;
        this.servicePvService = servicePvService;
    }


    @Override
    public void run(String... args) throws Exception {
        Clients client2= new Clients(1L,"tata","nona","154 cleneland ave","35"," for work") ;


        clientsRepo.save(client2);
        Clients client1 = new Clients();
     client1.setAge("33");
     client1.setAddress("uiydhjhdjkfhkj");
     client1.setData("hhhhhhjhkjh");
     client1.setId(1L);
     client1.setAge("33");
     client1.setLastName("hggkkjkjkj");

     clientsRepo.save(client1);

        Clients client5= new Clients(2L,"soso","barhom","234 stae rd columbus","58"," smoke alergy") ;
        clientsRepo.findAll();
        clientsRepo.save(client5);
        Clients client3= new Clients(3L,"zozo","lola","1234 smiit blv","22","long time stay") ;
        clientsRepo.save(client3);
        Coordinates coordinates1 = new Coordinates(67.8, 33.1,4);

        Hotel hotel1 = new Hotel(1L,"minara",new Coordinates(67.8,33,6));
      hotelRepo.save(hotel1);

        Hotel hotel2 = new Hotel(2L," riyad tala",new Coordinates(67.8, 48.6,7.9));
        hotelRepo.save(hotel2);
        Hotel hotel3 = new Hotel(3L,"tajja",new Coordinates(67.8, 99.8,90.7));
        hotelRepo.save(hotel3);
        Hotel hotel4 = new Hotel(4L,"marackech",new Coordinates(67.8, 7.8,8.9));
        hotelRepo.save(hotel4);
        Hotel hotel5 = new Hotel(5L,"howala",new Coordinates(67.8, 16.9,9.0));
        hotelRepo.save(hotel5);
        Room room1 = new Room(1L,"lovely","jija","12,6","columbus"," new hotel","1","0","new furniture");
        roomRepo.save(room1);
        Room room2 = new Room(2L,"3","stay company","good","Cleveland","in downtown","3","1","old style");
        roomRepo.save(room2);
        Room room3 = new Room(3L,"6","prevt company","bad","Cincinnati","new ","5","7","old place");
        roomRepo.save(room3);
        Room room4 = new Room(4L,"21","","","","","","","");
        roomRepo.save(room3);
        Room room5 = new Room(5L,"3","","","","","","","");
        roomRepo.save(room5);
        Room room6 = new Room(6L,"4","","","","","","","");
        roomRepo.save(room6);
        Room room7 = new Room(7L,"3","","","","","","","");
        roomRepo.save(room6);
        ServicePv servicePv1 =new ServicePv(1L,"","","");
        servicePvRepo.save(servicePv1);
        ServicePv servicePv2=new ServicePv(2L,"","","");
        servicePvRepo.save(servicePv2);
        ServicePv servicePv3 =new ServicePv(3L,"","","");
        servicePvRepo.save(servicePv2);




    }
}
