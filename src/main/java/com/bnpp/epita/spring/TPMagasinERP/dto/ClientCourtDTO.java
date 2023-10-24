package com.bnpp.epita.spring.TPMagasinERP.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public class ClientCourtDTO {

    private Integer id;
    private String nom;
    private String prenom;
    private String email;
    private String codePostal;
    private String ville;

    public ClientCourtDTO() {
    }

    public ClientCourtDTO(String nom, String prenom, String email, String codePostal, String ville) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.codePostal = codePostal;
        this.ville = ville;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
