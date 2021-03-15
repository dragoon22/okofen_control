package com.projet.okofen_control.model;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Oko_chaudiere {

    @Id
    @GeneratedValue
    private int id;
    @OneToMany(targetEntity = Oko_circuitChauffage.class, cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "chaudiere")
    private List<Oko_circuitChauffage> oko_circuitChauffage=new ArrayList<>();

    @OneToMany(targetEntity = Oko_circuitECS.class, cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "chaudiere")
    private List<Oko_circuitECS> oko_circuitECS=new ArrayList<>();
    @OneToMany(targetEntity = Oko_circuitSolaire.class, cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "chaudiere")
    private List<Oko_circuitSolaire> oko_circuitSolaire=new ArrayList<>();

    @OneToMany(targetEntity = Oko_conditionMeteo.class, cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "chaudiere")
    private List<Oko_conditionMeteo> oko_conditionMeteo=new ArrayList<>();

    @OneToMany(targetEntity = Oko_donneeStirling.class, cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "chaudiere")
    private List<Oko_donneeStirling> oko_donneeStirling=new ArrayList<>();

    @OneToMany(targetEntity = Oko_gainSolaire.class, cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "chaudiere")
    private List<Oko_gainSolaire> oko_gainSolaire=new ArrayList<>();

    @OneToMany(targetEntity = Oko_pompeCirculation.class, cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "chaudiere")
    private List<Oko_pompeCirculation> oko_pompeCirculation=new ArrayList<>();

    @OneToMany(targetEntity = Oko_previsionMeteo.class, cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "chaudiere")
    private List<Oko_previsionMeteo> oko_previsionMeteo=new ArrayList<>();

    @OneToMany(targetEntity = Oko_puissance.class, cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "chaudiere")
    private List<Oko_puissance> oko_puissance=new ArrayList<>();

    @OneToMany(targetEntity = Oko_systeme.class, cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "chaudiere")
    private List<Oko_systeme> oko_systeme=new ArrayList<>();

    @ManyToMany(targetEntity = User.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "chaudiere")
    private List<User> users=new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Oko_circuitChauffage> getOko_circuitChauffage() {
        return oko_circuitChauffage;
    }

    public void setOko_circuitChauffage(List<Oko_circuitChauffage> oko_circuitChauffage) {
        this.oko_circuitChauffage = oko_circuitChauffage;
    }

    public List<Oko_circuitECS> getOko_circuitECS() {
        return oko_circuitECS;
    }

    public void setOko_circuitECS(List<Oko_circuitECS> oko_circuitECS) {
        this.oko_circuitECS = oko_circuitECS;
    }

    public List<Oko_circuitSolaire> getOko_circuitSolaire() {
        return oko_circuitSolaire;
    }

    public void setOko_circuitSolaire(List<Oko_circuitSolaire> oko_circuitSolaire) {
        this.oko_circuitSolaire = oko_circuitSolaire;
    }

    public List<Oko_conditionMeteo> getOko_conditionMeteo() {
        return oko_conditionMeteo;
    }

    public void setOko_conditionMeteo(List<Oko_conditionMeteo> oko_conditionMeteo) {
        this.oko_conditionMeteo = oko_conditionMeteo;
    }

    public List<Oko_donneeStirling> getOko_donneeStirling() {
        return oko_donneeStirling;
    }

    public void setOko_donneeStirling(List<Oko_donneeStirling> oko_donneeStirling) {
        this.oko_donneeStirling = oko_donneeStirling;
    }

    public List<Oko_gainSolaire> getOko_gainSolaire() {
        return oko_gainSolaire;
    }

    public void setOko_gainSolaire(List<Oko_gainSolaire> oko_gainSolaire) {
        this.oko_gainSolaire = oko_gainSolaire;
    }

    public List<Oko_pompeCirculation> getOko_pompeCirculation() {
        return oko_pompeCirculation;
    }

    public void setOko_pompeCirculation(List<Oko_pompeCirculation> oko_pompeCirculation) {
        this.oko_pompeCirculation = oko_pompeCirculation;
    }

    public List<Oko_previsionMeteo> getOko_previsionMeteo() {
        return oko_previsionMeteo;
    }

    public void setOko_previsionMeteo(List<Oko_previsionMeteo> oko_previsionMeteo) {
        this.oko_previsionMeteo = oko_previsionMeteo;
    }

    public List<Oko_puissance> getOko_puissance() {
        return oko_puissance;
    }

    public void setOko_puissance(List<Oko_puissance> oko_puissance) {
        this.oko_puissance = oko_puissance;
    }

    public List<Oko_systeme> getOko_systeme() {
        return oko_systeme;
    }

    public void setOko_systeme(List<Oko_systeme> oko_systeme) {
        this.oko_systeme = oko_systeme;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUser(List<User> users) {
        this.users = users;
    }
}
