package com.dksoft.reservationmanagementserver.dao;

import com.dksoft.reservationmanagementserver.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelDao extends JpaRepository<Hotel , Integer> {
}
