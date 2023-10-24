package com.bnpp.epita.spring.TPMagasinERP.domaine;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class DevisLigne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne       //ManyToOne pour avoir plusieurs ligne d'un devis sur même pdt (ex : avec et sans remise)
    private Produit produit;
    private Integer quantite;
    private BigDecimal remise;


    public DevisLigne() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
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

    @Override
    public String toString() {
        return "DevisLigne{" +
                "id=" + id +
                ", produit=" + produit +
                ", quantite=" + quantite +
                ", remise=" + remise +
                '}';
    }
}
