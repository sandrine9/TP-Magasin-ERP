package com.bnpp.epita.spring.TPMagasinERP.dto;

import java.math.BigDecimal;

public class DevisLigneDetailDTO {
    private Integer id;
    private Integer produitId;
    private String produitNom;
    private Integer quantite;
    private BigDecimal prixHT;
    private BigDecimal prixTTC;
    private BigDecimal remise;
    private BigDecimal montantTTCavecRemise;


    public DevisLigneDetailDTO() {
    }

    public DevisLigneDetailDTO(Integer id, Integer produitId, String produitNom, Integer quantite, BigDecimal prixHT, BigDecimal prixTTC, BigDecimal remise, BigDecimal montantTTCavecRemise) {
        this.id = id;
        this.produitId = produitId;
        this.produitNom = produitNom;
        this.quantite = quantite;
        this.prixHT = prixHT;
        this.prixTTC = prixTTC;
        this.remise = remise;
        this.montantTTCavecRemise = montantTTCavecRemise;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProduitId() {
        return produitId;
    }

    public void setProduitId(Integer produitId) {
        this.produitId = produitId;
    }

    public String getProduitNom() {
        return produitNom;
    }

    public void setProduitNom(String produitNom) {
        this.produitNom = produitNom;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
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

    public BigDecimal getRemise() {
        return remise;
    }

    public void setRemise(BigDecimal remise) {
        this.remise = remise;
    }

    public BigDecimal getMontantTTCavecRemise() {
        return montantTTCavecRemise;
    }

    public void setMontantTTCavecRemise(BigDecimal montantTTCavecRemise) {
        this.montantTTCavecRemise = montantTTCavecRemise;
    }
}
