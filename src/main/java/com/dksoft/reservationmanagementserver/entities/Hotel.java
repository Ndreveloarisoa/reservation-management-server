package com.dksoft.reservationmanagementserver.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nom;
    private String ville;
    private int nbreEtoiles;
    private double prixParNuit;

    public Hotel(){
        super();
    }

    public Hotel(Integer id , String nom, String ville, int nbreEtoiles , double prixParNuit){
        this.id = id;
        this.nom = nom;
        this.ville = ville;
        this.nbreEtoiles = nbreEtoiles;
        this.prixParNuit = prixParNuit;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public int getNbreEtoiles() {
        return nbreEtoiles;
    }

    public void setNbreEtoiles(int nbreEtoiles) {
        this.nbreEtoiles = nbreEtoiles;
    }


    public double getPrixParNuit() {
        return prixParNuit;
    }


    public void setPrixParNuit(double prixParNuit) {
        this.prixParNuit = prixParNuit;
    }

    @Override
    public String toString() {
        return "[\nId : "+this.id+"\nNom : "+this.nom+"\nVille : "+this.ville+"\nNbre etoiles : "+this.nbreEtoiles+"\nPrix par nuit : "+this.prixParNuit+"\n]";
    }
}
