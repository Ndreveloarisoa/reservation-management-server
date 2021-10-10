package com.dksoft.reservationmanagementserver.services;

import com.dksoft.reservationmanagementserver.dao.ClientDao;
import com.dksoft.reservationmanagementserver.dto.LoginRequest;
import com.dksoft.reservationmanagementserver.dto.LoginResponse;
import com.dksoft.reservationmanagementserver.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private static final String ADMIN_EMAIL = "admin@gmail.com";
    @Autowired
    private ClientDao clientDao;

    public LoginResponse ajouterClient(Client client){
        Client savedClient = clientDao.save(client);
        return new LoginResponse(savedClient.getId(),savedClient.getNom()+""+savedClient.getPrenom(),savedClient.getEmail(),"CLIENT");
    }


    public LoginResponse login(LoginRequest loginRequest){
        Client client = clientDao.findByEmail(loginRequest.getEmail());
        if(client==null || !loginRequest.getMotDePasse().equals(client.getMotDePasse())){
            return new LoginResponse("Veuillez saisir des données correctes");
        }
        String role = client.getEmail().equals(ADMIN_EMAIL) ? "ADMIN" : "CLIENT";
        return new LoginResponse(client.getId(),client.getNom()+" "+client.getPrenom(),client.getEmail(),role);
    }
}
