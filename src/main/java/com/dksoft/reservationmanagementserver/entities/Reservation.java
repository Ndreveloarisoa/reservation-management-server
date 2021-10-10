package com.dksoft.reservationmanagementserver.entities;



import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDate dateDeReservation;

    private int nbreDeNuit;

    private int nbreDePersonne;

    @ManyToOne
    private Client client;

    @ManyToOne
    private Hotel hotel;

    public Reservation(){
        super();
    }

    public Reservation(LocalDate dateDeReservation , int nbreDeNuit , int nbreDePersonne , Client client, Hotel hotel){
        this.dateDeReservation = dateDeReservation;
        this.nbreDeNuit = nbreDeNuit;
        this.nbreDePersonne = nbreDePersonne;
        this.client = client;
        this.hotel = hotel;
    }

    public Reservation(Integer id , LocalDate dateDeReservation , int nbreDeNuit , int nbreDePersonne , Client client, Hotel hotel){
        this.id = id;
        this.dateDeReservation = dateDeReservation;
        this.nbreDeNuit = nbreDeNuit;
        this.nbreDePersonne = nbreDePersonne;
        this.client = client;
        this.hotel = hotel;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDateDeReservation() {
        return dateDeReservation;
    }

    public void setDateDeReservation(LocalDate dateDeReservation) {
        this.dateDeReservation = dateDeReservation;
    }

    public int getNbreDeNuit() {
        return nbreDeNuit;
    }

    public void setNbreDeNuit(int nbreDeNuit) {
        this.nbreDeNuit = nbreDeNuit;
    }


    public int getNbreDePersonne() {
        return nbreDePersonne;
    }

    public void setNbreDePersonne(int nbreDePersonne) {
        this.nbreDePersonne = nbreDePersonne;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public String toString() {
        return "[\nId : "+this.id+"\nDate de reservation : "+this.dateDeReservation+"\nNbre de nuit : "+this.nbreDeNuit+"\nNbre de personne : "+this.nbreDePersonne+"\n]";
    }
}
