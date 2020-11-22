package com.projet.okofen_control.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Oko_chaudiere {

    @Id
    @GeneratedValue
    private String id;

    private Integer fkCircuitChauffage;
    private Integer fkCircuitEcs;
    private Integer fkCircuitSolaire;
    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
