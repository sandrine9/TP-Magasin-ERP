package com.bnpp.epita.spring.TPMagasinERP.dto;

import java.math.BigDecimal;

public class ProduitDTO {
    private Integer id;
    private String nom;
    private BigDecimal prixHT;
    private BigDecimal prixTTC;
    private String description;
    private String photoURL;

    public ProduitDTO() {
    }

    public ProduitDTO(Integer id, String nom, BigDecimal prixHT, BigDecimal prixTTC, String description, String photoURL) {
        this.id = id;
        this.nom = nom;
        this.prixHT = prixHT;
        this.prixTTC = prixTTC;
        this.description = description;
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

    public BigDecimal getPrixTTC() {
        return prixTTC;
    }

    public void setPrixTTC(BigDecimal prixTTC) {
        this.prixTTC = prixTTC;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhotoURL() {
        return photoURL;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }

    @Override
    public String toString() {
        return "ProduitDTO{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prixHT=" + prixHT +
                ", prixTTC=" + prixTTC +
                ", description='" + description + '\'' +
                ", photoURL='" + photoURL + '\'' +
                '}';
    }
}
