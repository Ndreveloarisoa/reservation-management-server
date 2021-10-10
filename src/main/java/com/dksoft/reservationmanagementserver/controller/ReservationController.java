package com.dksoft.reservationmanagementserver.controller;


import com.dksoft.reservationmanagementserver.dto.ReservationDto;
import com.dksoft.reservationmanagementserver.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;


    @PostMapping("/api/reservations")
    public ReservationDto reserverHotel(@RequestBody ReservationDto reservationDto){
        return reservationService.reserverHotel(reservationDto);
    }


    @GetMapping("/api/reservations/{idReservation}")
    public ReservationDto detailDeReservation(@PathVariable Integer idReservation){
        return reservationService.detailDeReservation(idReservation);
    }

    @GetMapping("/api/reservations/client/{clientId}")
    public List<ReservationDto> recupererLesReservationsDunClient(@PathVariable Integer clientId){
        return reservationService.recupererLesReservationsDunClient(clientId);
    }

    @GetMapping("/api/reservations")
    public List<ReservationDto> recupererToutesLesReservations(){
        return reservationService.recupererToutesLesReservations();
    }


    @DeleteMapping("/api/reservations/{idReservation}")
    public boolean supprimerReservation(@PathVariable Integer idReservation){
         reservationService.supprimerReservation(idReservation);
         return true;
    }
}
