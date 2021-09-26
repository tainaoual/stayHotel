//package com.example.stayhotel.bootstrap;

//
//@Component
//public class Loader implements CommandLineRunner {
//
//
//    private final HotelService hotelService;
//    private final ServicePvService servicePvService;
//    private final ClientService clientService;
//
//
//    public Loader(HotelService hotelService, ServicePvService servicePvService, ClientService clientService) {
//        this.hotelService = hotelService;
//        this.servicePvService = servicePvService;
//        this.clientService = clientService;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//
//
//        Hotel h1 = new Hotel();
//        Coordinates coordinates1 = new Coordinates();
//        h1.setName("Hotel Taj");
//        h1.setCoordinates(coordinates1);
//        ServicePv servicePv1 = new ServicePv();
//        servicePv1.setServicePvId("abc1");
//        servicePv1.setServicePvId1("abc12");
//        servicePv1.setServicePvId2("abc123");
//
//        Client client1 = new Client();
//
//        client1.setLastName("doe");
//        client1.setAddress("78 Arthurs crescent brampton, ON");
//        client1.setAge("25");
//        client1.setData("27th Sept, 2021");
//        Room room1 = new Room();
//        room1.setHotel(h1);
//        room1.setRoomId("ROOM NO 1109");
//        room1.setOwner("john");
//        room1.setCondition("Don't smoke");
//        room1.setLocation("markham");
//        room1.setClient(client1);
//        room1.setHistory("Well");
//        room1.setFloor("3rd");
//        room1.setSmokeLevel("low");
//        room1.setSummary("Good & regular Customer");
//        room1.setServicePv(servicePv1);
//        ServicePv servicePv2 = new ServicePv();
//        servicePv2.setServicePvId("xyz1");
//        servicePv2.setServicePvId1("xyz12");
//        servicePv2.setServicePvId2("xyz123");
//        Client client2 = new Client();
//        client2.setName("Jonny");
//        client2.setLastName("Hitler");
//        client2.setAddress("80 Arthurs crescent brampton, ON");
//        client2.setAge("35");
//        client2.setData("31th Dec, 2021");
//        Room room2 = new Room();
//        room2.setHotel(h1);
//        room2.setRoomId("ROOM NO 202");
//        room2.setOwner("Fanny");
//        room2.setCondition("Don't Drink");
//        room2.setLocation("Scarborough");
//        room2.setClient(client2);
//        room2.setHistory("Good");
//        room2.setFloor("5th");
//        room2.setSmokeLevel("medium");
//        room2.setSummary("Nice Person");
//        room2.setServicePv(servicePv2);
//        List<Room> rooms = new ArrayList<>();
//        rooms.add(room1);
//        rooms.add(room2);
//        h1.setRooms(rooms);
//        servicePvService.saveServicePv(servicePv1);
//        clientService.saveClient(client1);
//        servicePvService.saveServicePv(servicePv2);
//        clientService.saveClient(client2);
//        hotelService.saveHotel(h1);
//
//    }
  //  }