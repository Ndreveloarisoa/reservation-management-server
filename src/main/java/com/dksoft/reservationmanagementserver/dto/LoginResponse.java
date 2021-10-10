package com.dksoft.reservationmanagementserver.dto;

public class LoginResponse {

    private Integer id;
    private String nom;
    private String email;
    private String role;
    private String errorMessage;

    public LoginResponse(){
        super();
    }


    public LoginResponse(String errorMessage){
        this.errorMessage = errorMessage;
    }

    public LoginResponse(Integer id , String nom , String email , String role){
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.role = role;

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

    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getErrorMessage() {
        return errorMessage;
    }


    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
