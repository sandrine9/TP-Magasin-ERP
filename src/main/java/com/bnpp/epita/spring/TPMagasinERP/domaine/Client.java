package com.bnpp.epita.spring.TPMagasinERP.domaine;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private String email;
    @OneToOne(cascade = {CascadeType.ALL})
    private Adresse adresse;
    private String password;
    @ManyToMany
    private List<RoleClient> roles;

    public Client() {
    }

    public Client(Integer id, String nom, String prenom, LocalDate dateNaissance, String email, Adresse adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.email = email;
        this.adresse = adresse;
    }

    public Client(String nom, String prenom, LocalDate dateNaissance, String email, Adresse adresse, String password, List<RoleClient> roles) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.email = email;
        this.adresse = adresse;
        this.password = password;
        this.roles = roles;
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

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
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

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", email='" + email + '\'' +
                ", adresse=" + adresse +
                ", password='" + password + '\'' +
                ", roles=" + roles +
                '}';
    }
}
