package com.dksoft.reservationmanagementserver;

import com.dksoft.reservationmanagementserver.dao.ClientDao;
import com.dksoft.reservationmanagementserver.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReservationManagementServerApplication implements CommandLineRunner {

	private static final String ADMIN_EMAIL = "admin@gmail.com";

	@Autowired
	private ClientDao clientDao;

	public static void main(String[] args) {
		SpringApplication.run(ReservationManagementServerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Client client = clientDao.findByEmail(ADMIN_EMAIL);
		if(client==null){
			clientDao.save(new Client("Admin","Admin",ADMIN_EMAIL,"0000"));
		}
	}
}
