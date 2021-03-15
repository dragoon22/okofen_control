package com.projet.okofen_control.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Oko_systeme {    @Id
@GeneratedValue
private int id;
    @JsonIgnore
    @ManyToOne(targetEntity=Oko_chaudiere.class, fetch = FetchType.LAZY)
    private Oko_chaudiere chaudiere;
    private String L_errors;
   private String L_ambient;
   private String L_usb_stick;

    public String getL_errors() {
        return L_errors;
    }

    public void setL_errors(String l_errors) {
        L_errors = l_errors;
    }

    public String getL_ambient() {
        return L_ambient;
    }

    public void setL_ambient(String l_ambient) {
        L_ambient = l_ambient;
    }

    public String getL_usb_stick() {
        return L_usb_stick;
    }

    public void setL_usb_stick(String l_usb_stick) {
        L_usb_stick = l_usb_stick;
    }

    public Oko_chaudiere getChaudiere() {
        return chaudiere;
    }

    public void setChaudiere(Oko_chaudiere chaudiere) {
        this.chaudiere = chaudiere;
    }
    @Override
    public String toString() {
        return "Oko_systeme{" +
                "L_errors='" + L_errors + '\'' +
                ", L_ambient='" + L_ambient + '\'' +
                ", L_usb_stick='" + L_usb_stick + '\'' +
                '}';
    }
}
