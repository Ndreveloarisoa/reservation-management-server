package com.dksoft.reservationmanagementserver.controller;


import com.dksoft.reservationmanagementserver.dto.LoginRequest;
import com.dksoft.reservationmanagementserver.dto.LoginResponse;
import com.dksoft.reservationmanagementserver.entities.Client;
import com.dksoft.reservationmanagementserver.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class ClientController {

    @Autowired
    private ClientService clientService;


    @PostMapping("/api/clients")
    public LoginResponse ajouterClient(@RequestBody Client client){
        return clientService.ajouterClient(client);
    }


    @PostMapping("/api/clients/login")
    public LoginResponse login(@RequestBody LoginRequest loginRequest){
        return clientService.login(loginRequest);
    }
}
