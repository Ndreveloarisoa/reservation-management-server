package com.dksoft.reservationmanagementserver.dao;


import com.dksoft.reservationmanagementserver.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservationDao extends JpaRepository<Reservation , Integer> {

    List<Reservation>  findByClient_Id(Integer clientId);
}
