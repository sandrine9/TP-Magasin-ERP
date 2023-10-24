package com.bnpp.epita.spring.TPMagasinERP.dto;

import com.bnpp.epita.spring.TPMagasinERP.domaine.RoleClient;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.List;

public class ClientDTO {

    private Integer id;
    private String nom;
    private String prenom;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateNaissance;
    private String email;
    @JsonProperty("adresse")    // pour que dans le json, il s'appelle adresse et non adresseDTO
    private AdresseDTO adresseDTO;
    private String password;
    private List<RoleClient> roles;


    public ClientDTO() {
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

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AdresseDTO getAdresseDTO() {
        return adresseDTO;
    }

    public void setAdresseDTO(AdresseDTO adresseDTO) {
        this.adresseDTO = adresseDTO;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<RoleClient> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleClient> roles) {
        this.roles = roles;
    }
}
