package com.projet.okofen_control.model;

public class Oko_chaudiere {


    private Oko_circuitChauffage oko_circuitChauffage;
    private Oko_circuitECS oko_circuitECS;
    private Oko_circuitSolaire oko_circuitSolaire;
    private Oko_conditionMeteo oko_conditionMeteo;
    private Oko_donnéeStirling oko_donneeStirling;
    private Oko_gainSolaire oko_gainSolaire;
    private Oko_pompeCirculation oko_pompeCirculation;
    private Oko_previsionMeteo oko_previsionMeteo;
    private Oko_puissance oko_puissance;
    private Oko_systeme oko_systeme;
    private Oko_user oko_user;

    public Oko_circuitChauffage getOko_circuitChauffage() {
        return oko_circuitChauffage;
    }

    public void setOko_circuitChauffage(Oko_circuitChauffage oko_circuitChauffage) {
        this.oko_circuitChauffage = oko_circuitChauffage;
    }

    public Oko_circuitECS getOko_circuitECS() {
        return oko_circuitECS;
    }

    public void setOko_circuitECS(Oko_circuitECS oko_circuitECS) {
        this.oko_circuitECS = oko_circuitECS;
    }

    public Oko_circuitSolaire getOko_circuitSolaire() {
        return oko_circuitSolaire;
    }

    public void setOko_circuitSolaire(Oko_circuitSolaire oko_circuitSolaire) {
        this.oko_circuitSolaire = oko_circuitSolaire;
    }

    public Oko_conditionMeteo getOko_conditionMeteo() {
        return oko_conditionMeteo;
    }

    public void setOko_conditionMeteo(Oko_conditionMeteo oko_conditionMeteo) {
        this.oko_conditionMeteo = oko_conditionMeteo;
    }

    public Oko_donnéeStirling getOko_donneeStirling() {
        return oko_donneeStirling;
    }

    public void setOko_donneeStirling(Oko_donnéeStirling oko_donneeStirling) {
        this.oko_donneeStirling = oko_donneeStirling;
    }

    public Oko_gainSolaire getOko_gainSolaire() {
        return oko_gainSolaire;
    }

    public void setOko_gainSolaire(Oko_gainSolaire oko_gainSolaire) {
        this.oko_gainSolaire = oko_gainSolaire;
    }

    public Oko_pompeCirculation getOko_pompeCirculation() {
        return oko_pompeCirculation;
    }

    public void setOko_pompeCirculation(Oko_pompeCirculation oko_pompeCirculation) {
        this.oko_pompeCirculation = oko_pompeCirculation;
    }

    public Oko_previsionMeteo getOko_previsionMeteo() {
        return oko_previsionMeteo;
    }

    public void setOko_previsionMeteo(Oko_previsionMeteo oko_previsionMeteo) {
        this.oko_previsionMeteo = oko_previsionMeteo;
    }

    public Oko_puissance getOko_puissance() {
        return oko_puissance;
    }

    public void setOko_puissance(Oko_puissance oko_puissance) {
        this.oko_puissance = oko_puissance;
    }

    public Oko_systeme getOko_systeme() {
        return oko_systeme;
    }

    public void setOko_systeme(Oko_systeme oko_systeme) {
        this.oko_systeme = oko_systeme;
    }

    public Oko_user getOko_user() {
        return oko_user;
    }

    public void setOko_user(Oko_user oko_user) {
        this.oko_user = oko_user;
    }

    @Override
    public String toString() {
        return "Oko_chaudiere{" +
                "oko_circuitChauffage=" + oko_circuitChauffage +
                ", oko_circuitECS=" + oko_circuitECS +
                ", oko_circuitSolaire=" + oko_circuitSolaire +
                ", oko_conditionMeteo=" + oko_conditionMeteo +
                ", oko_donnéeStirling=" + oko_donneeStirling +
                ", oko_gainSolaire=" + oko_gainSolaire +
                ", oko_pompeCirculation=" + oko_pompeCirculation +
                ", oko_previsionMeteo=" + oko_previsionMeteo +
                ", oko_puissance=" + oko_puissance +
                ", oko_systeme=" + oko_systeme +
                ", oko_user=" + oko_user +
                '}';
    }

}
