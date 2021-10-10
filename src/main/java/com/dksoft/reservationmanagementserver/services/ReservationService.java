package com.dksoft.reservationmanagementserver.services;


import com.dksoft.reservationmanagementserver.dao.ClientDao;
import com.dksoft.reservationmanagementserver.dao.HotelDao;
import com.dksoft.reservationmanagementserver.dao.ReservationDao;
import com.dksoft.reservationmanagementserver.dto.ReservationDto;
import com.dksoft.reservationmanagementserver.entities.Client;
import com.dksoft.reservationmanagementserver.entities.Hotel;
import com.dksoft.reservationmanagementserver.entities.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ReservationService {

    @Autowired
    private ClientDao clientDao;

    @Autowired
    private HotelDao hotelDao;

    @Autowired
    private ReservationDao reservationDao;


    public ReservationDto reserverHotel(ReservationDto reservationDto){
        Client client = clientDao.getById(reservationDto.getIdClient());
        Hotel hotel = hotelDao.getById(reservationDto.getIdHotel());
        Reservation reservation = new Reservation(LocalDate.now(),reservationDto.getNbreDeNuit(),reservationDto.getNbreDePersonne(),client,hotel);
        Reservation reservationEnregistree = reservationDao.save(reservation);
        return setReservation(reservationEnregistree);
    }


    public ReservationDto detailDeReservation(Integer idReservation){
        Reservation reservation = reservationDao.getById(idReservation);
        return setReservation(reservation);
    }


    public List<ReservationDto>  recupererLesReservationsDunClient(Integer clientId){
        List<ReservationDto> reservationDtos = new ArrayList<>();
        List<Reservation> reservationsClient = reservationDao.findByClient_Id(clientId);
        for (Reservation reservation : reservationsClient){
            ReservationDto reservationDto = setReservation(reservation);
            reservationDtos.add(reservationDto);
        }
        return reservationDtos;
    }


    public List<ReservationDto> recupererToutesLesReservations(){
        List<ReservationDto> reservationDtos = new ArrayList<>();
        List<Reservation> reservationsClient = reservationDao.findAll();
        for (Reservation reservation : reservationsClient){
            ReservationDto reservationDto = setReservation(reservation);
            reservationDtos.add(reservationDto);
        }
        return reservationDtos;
    }


    public void supprimerReservation(Integer idReservation){
        reservationDao.deleteById(idReservation);
    }

     ReservationDto setReservation(Reservation reservation){
        String clientName = reservation.getClient().getNom()+" "+reservation.getClient().getPrenom();
        String hotelName = reservation.getHotel().getNom();
        String villeHotel = reservation.getHotel().getVille();
        int nbreEtoiles = reservation.getHotel().getNbreEtoiles();
        double prix = reservation.getNbreDePersonne()*reservation.getHotel().getPrixParNuit()*reservation.getNbreDeNuit();
        return new ReservationDto(reservation.getId(),clientName,hotelName,villeHotel,nbreEtoiles,prix,
                reservation.getNbreDePersonne(),reservation.getNbreDeNuit(),reservation.getDateDeReservation());
    }
}
