package com.bnpp.epita.spring.TPMagasinERP.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nom;
    private BigDecimal prixHT;
    private String description;
    private String photoURL;

    public Produit() {
    }

    public Produit(String nom, BigDecimal prixHT, String description, String photoURL) {
        this.nom = nom;
        this.prixHT = prixHT;
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
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prixHT=" + prixHT +
                ", description='" + description + '\'' +
                ", photoURL='" + photoURL + '\'' +
                '}';
    }
}
