package com.projet.okofen_control.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue
    private int id;
    @JsonIgnore
    @ManyToMany(targetEntity=Oko_chaudiere.class, fetch = FetchType.LAZY)
    private List<Oko_chaudiere> chaudiere;

    private String nom;
    private String token;
    private String login;

    public User() {
    }

    public User(int id, String nom, String token, String login) {
        this.id = id;
        this.nom = nom;
        this.token = token;
        this.login = login;
    }

    public List<Oko_chaudiere> getChaudiere() {
        return chaudiere;
    }

    public void setChaudiere(List<Oko_chaudiere> chaudiere) {
        this.chaudiere = chaudiere;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String user) {
        this.login = user;
    }
}
