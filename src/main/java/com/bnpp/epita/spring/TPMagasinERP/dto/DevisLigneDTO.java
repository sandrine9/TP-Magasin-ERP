package com.bnpp.epita.spring.TPMagasinERP.dto;

import java.math.BigDecimal;

public class DevisLigneDTO {
    private Integer id;
    private ProduitDTO produitDTO;
    private Integer quantite;
    private BigDecimal remise;
    private BigDecimal montantTTCavecRemise;   // oui ajouter dans le dto une ligne montant ligne

    public DevisLigneDTO() {
    }

    public DevisLigneDTO(Integer id, ProduitDTO produitDTO, Integer quantite, BigDecimal remise, BigDecimal montantTTCavecRemise) {
        this.id = id;
        this.produitDTO = produitDTO;
        this.quantite = quantite;
        this.remise = remise;
        this.montantTTCavecRemise = montantTTCavecRemise;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ProduitDTO getProduitDTO() {
        return produitDTO;
    }

    public void setProduitDTO(ProduitDTO produitDTO) {
        this.produitDTO = produitDTO;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
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
