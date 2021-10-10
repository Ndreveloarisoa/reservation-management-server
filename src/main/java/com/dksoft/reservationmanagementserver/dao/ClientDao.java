package com.dksoft.reservationmanagementserver.dao;

import com.dksoft.reservationmanagementserver.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientDao extends JpaRepository<Client , Integer> {

    Client findByEmail(String email);
}
