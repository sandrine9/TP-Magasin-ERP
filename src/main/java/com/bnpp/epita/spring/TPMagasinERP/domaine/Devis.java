package com.bnpp.epita.spring.TPMagasinERP.domaine;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Devis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(name = "dateDevis")  // pour éviter un mot réservé "date" en BDD
    private LocalDate date; //ajouté Sébastien
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Client client;
    //CascadeType.Persist+Merge pour pouvoir créer le client en même temps que devis
    //par défaut fetch eager  OK

    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    private List<DevisLigne> listeLignes;
    //cascade ALL, aussi pour la modif on passera par devis
    //par rapport à : @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})

    //private BigDecimal montantDevis;     //non mis par Sébastien


    public Devis() {
    }

    public Devis(LocalDate date, Client client, List<DevisLigne> listeLignes) {
        this.date = date;
        this.client = client;
        this.listeLignes = listeLignes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<DevisLigne> getListeLignes() {
        return listeLignes;
    }

    public void setListeLignes(List<DevisLigne> listeLignes) {
        this.listeLignes = listeLignes;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Devis{" +
                "id=" + id +
                ", date=" + date +
                ", client=" + client +
                ", listeLignes=" + listeLignes +
                '}';
    }
}
