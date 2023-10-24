package com.bnpp.epita.spring.TPMagasinERP.dto;

import java.math.BigDecimal;

public class ProduitCourtDTO {
    private Integer id;
    private String nom;
    private BigDecimal prixHT;
    private String photoURL;

    public ProduitCourtDTO() {
    }
    public ProduitCourtDTO(Integer id, String nom, BigDecimal prixHT, String photoURL) {
        this.id = id;
        this.nom = nom;
        this.prixHT = prixHT;
        this.photoURL = photoURL;
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

    public BigDecimal getPrixHT() {
        return prixHT;
    }

    public void setPrixHT(BigDecimal prixHT) {
        this.prixHT = prixHT;
    }

    public String getPhotoURL() {
        return photoURL;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }
}
