package com.bnpp.epita.spring.TPMagasinERP.domaine;

import javax.persistence.*;

@Entity
@Table(name = "role")
public class RoleClient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nom;

    public RoleClient(String nom) {
        this.nom = nom;
    }

    public RoleClient() {
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
}
