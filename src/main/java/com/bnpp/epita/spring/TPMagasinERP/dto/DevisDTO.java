package com.bnpp.epita.spring.TPMagasinERP.dto;

import com.bnpp.epita.spring.TPMagasinERP.domaine.Client;
import com.bnpp.epita.spring.TPMagasinERP.domaine.DevisLigne;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class DevisDTO {
    //on peut faire DevisDTO extends DevisCourtDTO
    // et ne pas remettre les attributs id et client
    private Integer id;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
    private Client client;
    private List<DevisLigneDTO> listeLignes;
    private BigDecimal montantDevis;

    public DevisDTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<DevisLigneDTO> getListeLignes() {
        return listeLignes;
    }

    public void setListeLignes(List<DevisLigneDTO> listeLignes) {
        this.listeLignes = listeLignes;
    }

    public BigDecimal getMontantDevis() {
        return montantDevis;
    }

    public void setMontantDevis(BigDecimal montantDevis) {
        this.montantDevis = montantDevis;
    }

    @Override
    public String toString() {
        return "DevisDTO{" +
                "id=" + id +
                ", date=" + date +
                ", client=" + client +
                ", listeLignes=" + listeLignes +
                ", montantDevis=" + montantDevis +
                '}';
    }
}
