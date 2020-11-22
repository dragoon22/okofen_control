package com.projet.okofen_control.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Oko_circuitChauffage {

    @Id
    @GeneratedValue
    private String id;

    private String L_flowtemp_set;
    private String L_roomtemp_act;
    private String L_roomtemp_set;
    private String L_state;
    private String L_statetext;
    private String mode_auto;
    private String name;
    private String oekomode;
    private String temp_heat;
    private String temp_setback;
    private String temp_vacation;
    private String time_prg;

    public String getL_flowtemp_set() {
        return L_flowtemp_set;
    }

    public void setL_flowtemp_set(String l_flowtemp_set) {
        L_flowtemp_set = l_flowtemp_set;
    }

    public String getL_roomtemp_act() {
        return L_roomtemp_act;
    }

    public void setL_roomtemp_act(String l_roomtemp_act) {
        L_roomtemp_act = l_roomtemp_act;
    }

    public String getL_roomtemp_set() {
        return L_roomtemp_set;
    }

    public void setL_roomtemp_set(String l_roomtemp_set) {
        L_roomtemp_set = l_roomtemp_set;
    }

    public String getL_state() {
        return L_state;
    }

    public void setL_state(String l_state) {
        L_state = l_state;
    }

    public String getL_statetext() {
        return L_statetext;
    }

    public void setL_statetext(String l_statetext) {
        L_statetext = l_statetext;
    }

    public String getMode_auto() {
        return mode_auto;
    }

    public void setMode_auto(String mode_auto) {
        this.mode_auto = mode_auto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOekomode() {
        return oekomode;
    }

    public void setOekomode(String oekomode) {
        this.oekomode = oekomode;
    }

    public String getTemp_heat() {
        return temp_heat;
    }

    public void setTemp_heat(String temp_heat) {
        this.temp_heat = temp_heat;
    }

    public String getTemp_setback() {
        return temp_setback;
    }

    public void setTemp_setback(String temp_setback) {
        this.temp_setback = temp_setback;
    }

    public String getTemp_vacation() {
        return temp_vacation;
    }

    public void setTemp_vacation(String temp_vacation) {
        this.temp_vacation = temp_vacation;
    }

    public String getTime_prg() {
        return time_prg;
    }

    public void setTime_prg(String time_prg) {
        this.time_prg = time_prg;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
