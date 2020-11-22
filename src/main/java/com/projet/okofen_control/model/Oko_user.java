package com.projet.okofen_control.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Oko_user {
    @Id
    @GeneratedValue
    private int id;

    private String nom;
    private String token;
    private String login;

    public Oko_user() {
    }

    public Oko_user(int id, String nom, String token, String login) {
        this.id = id;
        this.nom = nom;
        this.token = token;
        this.login = login;
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
