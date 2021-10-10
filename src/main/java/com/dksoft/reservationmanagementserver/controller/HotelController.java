package com.dksoft.reservationmanagementserver.controller;


import com.dksoft.reservationmanagementserver.entities.Hotel;
import com.dksoft.reservationmanagementserver.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class HotelController {

    @Autowired
    private HotelService hotelService;



    @PostMapping("/api/hotels")
    public Hotel ajouterHotel(@RequestBody Hotel hotel){
        return hotelService.ajouterHotel(hotel);
    }


    @GetMapping("/api/hotels")
    public List<Hotel> recuperTousLesHotels(){
        return hotelService.recuperTousLesHotels();
    }


    @GetMapping("/api/hotels/{idHotel}")
    public Hotel recuperHotel(@PathVariable Integer idHotel){
        return hotelService.recupererHotel(idHotel);
    }


    @PutMapping("/api/hotels")
    public Hotel modifierHotel(@RequestBody Hotel hotel){
        return hotelService.modifierHotel(hotel);
    }

    @DeleteMapping("/api/hotels/{idHotel}")
    public boolean supprimerHotel(@PathVariable Integer idHotel){
        hotelService.supprimerHotel(idHotel);
        return true;
    }
}
