package com.projet.okofen_control.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Oko_donneeStirling {
    @Id
    @GeneratedValue
    private int id;
    @JsonIgnore
    @ManyToOne(targetEntity=Oko_chaudiere.class, fetch = FetchType.LAZY)
    private Oko_chaudiere chaudiere;

    public Oko_chaudiere getChaudiere() {
        return chaudiere;
    }

    public void setChaudiere(Oko_chaudiere chaudiere) {
        this.chaudiere = chaudiere;
    }
}
