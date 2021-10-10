package com.dksoft.reservationmanagementserver.dto;



import java.time.LocalDate;

public class ReservationDto {

    private Integer id;


    private Integer idClient;

    private Integer idHotel;

    private int nbreDeNuit;

    private int nbreDePersonne;

    private String clientName;

    private String hotelName;

    private String villeHotel;

    private int nbreEtoiles;

    private double prix;

    private LocalDate dateDeReservation;

    public ReservationDto(){
        super();
    }

    public ReservationDto(Integer id , Integer idClient , Integer idHotel , int nbreDePersonne , int nbreDeNuit){
        this.id = id;
        this.idClient = idClient;
        this.idHotel = idHotel;
        this.nbreDeNuit = nbreDeNuit;
        this.nbreDePersonne = nbreDePersonne;
    }

    public ReservationDto(Integer id , String clientName , String hotelName, String villeHotel , int nbreEtoiles, double prix,
                          int nbreDePersonne , int nbreDeNuit , LocalDate dateDeReservation){
        this.id = id;
        this.clientName = clientName;
        this.hotelName = hotelName;
        this.villeHotel = villeHotel;
        this.nbreEtoiles = nbreEtoiles;
        this.prix = prix;
        this.nbreDeNuit = nbreDeNuit;
        this.nbreDePersonne = nbreDePersonne;
        this.dateDeReservation = dateDeReservation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    public Integer getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(Integer idHotel) {
        this.idHotel = idHotel;
    }

    public int getNbreDePersonne() {
        return nbreDePersonne;
    }

    public void setNbreDePersonne(int nbreDePersonne) {
        this.nbreDePersonne = nbreDePersonne;
    }

    public int getNbreDeNuit() {
        return nbreDeNuit;
    }

    public void setNbreDeNuit(int nbreDeNuit) {
        this.nbreDeNuit = nbreDeNuit;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }


    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getVilleHotel() {
        return villeHotel;
    }

    public void setVilleHotel(String villeHotel) {
        this.villeHotel = villeHotel;
    }

    public int getNbreEtoiles() {
        return nbreEtoiles;
    }

    public void setNbreEtoiles(int nbreEtoiles) {
        this.nbreEtoiles = nbreEtoiles;
    }

    public double getPrix() {
        return prix;
    }


    public void setPrix(double prix) {
        this.prix = prix;
    }

    public LocalDate getDateDeReservation() {
        return dateDeReservation;
    }

    public void setDateDeReservation(LocalDate dateDeReservation) {
        this.dateDeReservation = dateDeReservation;
    }
}
