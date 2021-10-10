package com.dksoft.reservationmanagementserver.services;


import com.dksoft.reservationmanagementserver.dao.HotelDao;
import com.dksoft.reservationmanagementserver.entities.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelService {

    @Autowired
    private HotelDao hotelDao;


    public Hotel ajouterHotel(Hotel hotel){
        return hotelDao.save(hotel);
    }

    public Hotel modifierHotel(Hotel hotel){
        return hotelDao.saveAndFlush(hotel);
    }

    public List<Hotel> recuperTousLesHotels(){
        return hotelDao.findAll();
    }


    public Hotel recupererHotel(Integer idHotel){
        Optional<Hotel> optionalHotel =hotelDao.findById(idHotel);
        if(optionalHotel.isPresent()){
            Hotel hotel = optionalHotel.get();
            return hotel;
        }
        return null;
    }


    public void supprimerHotel(Integer idHotel){
        hotelDao.deleteById(idHotel);
    }



}
