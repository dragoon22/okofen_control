package com.projet.okofen_control.model;

public class Oko_circuitECS {
  private String time_prg;
  private String oekomode;
  private String sensor_off;
  private String mode_dhw;
  private String L_pump;
  private String temp_min_set;
  private String temp_max_set;
  private String L_ontemp_act;
  private String L_statetext;
  private String L_temp_set;
  private String smartstart;
  private String heat_once;
  private String L_offtemp_ac;
  private String sensor_on;
  private String name;
  private String mode_auto	;
  private String L_state;
  private String use_boiler_heat	;

    public String getTime_prg() {
        return time_prg;
    }

    public void setTime_prg(String time_prg) {
        this.time_prg = time_prg;
    }

    public String getOekomode() {
        return oekomode;
    }

    public void setOekomode(String oekomode) {
        this.oekomode = oekomode;
    }

    public String getSensor_off() {
        return sensor_off;
    }

    public void setSensor_off(String sensor_off) {
        this.sensor_off = sensor_off;
    }

    public String getMode_dhw() {
        return mode_dhw;
    }

    public void setMode_dhw(String mode_dhw) {
        this.mode_dhw = mode_dhw;
    }

    public String getL_pump() {
        return L_pump;
    }

    public void setL_pump(String l_pump) {
        L_pump = l_pump;
    }

    public String getTemp_min_set() {
        return temp_min_set;
    }

    public void setTemp_min_set(String temp_min_set) {
        this.temp_min_set = temp_min_set;
    }

    public String getTemp_max_set() {
        return temp_max_set;
    }

    public void setTemp_max_set(String temp_max_set) {
        this.temp_max_set = temp_max_set;
    }

    public String getL_ontemp_act() {
        return L_ontemp_act;
    }

    public void setL_ontemp_act(String l_ontemp_act) {
        L_ontemp_act = l_ontemp_act;
    }

    public String getL_statetext() {
        return L_statetext;
    }

    public void setL_statetext(String l_statetext) {
        L_statetext = l_statetext;
    }

    public String getL_temp_set() {
        return L_temp_set;
    }

    public void setL_temp_set(String l_temp_set) {
        L_temp_set = l_temp_set;
    }

    public String getSmartstart() {
        return smartstart;
    }

    public void setSmartstart(String smartstart) {
        this.smartstart = smartstart;
    }

    public String getHeat_once() {
        return heat_once;
    }

    public void setHeat_once(String heat_once) {
        this.heat_once = heat_once;
    }

    public String getL_offtemp_ac() {
        return L_offtemp_ac;
    }

    public void setL_offtemp_ac(String l_offtemp_ac) {
        L_offtemp_ac = l_offtemp_ac;
    }

    public String getSensor_on() {
        return sensor_on;
    }

    public void setSensor_on(String sensor_on) {
        this.sensor_on = sensor_on;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMode_auto() {
        return mode_auto;
    }

    public void setMode_auto(String mode_auto) {
        this.mode_auto = mode_auto;
    }

    public String getL_state() {
        return L_state;
    }

    public void setL_state(String l_state) {
        L_state = l_state;
    }

    public String getUse_boiler_heat() {
        return use_boiler_heat;
    }

    public void setUse_boiler_heat(String use_boiler_heat) {
        this.use_boiler_heat = use_boiler_heat;
    }

    @Override
    public String toString() {
        return "Oko_circuitECS{" +
                "time_prg='" + time_prg + '\'' +
                ", oekomode='" + oekomode + '\'' +
                ", sensor_off='" + sensor_off + '\'' +
                ", mode_dhw='" + mode_dhw + '\'' +
                ", L_pump='" + L_pump + '\'' +
                ", temp_min_set='" + temp_min_set + '\'' +
                ", temp_max_set='" + temp_max_set + '\'' +
                ", L_ontemp_act='" + L_ontemp_act + '\'' +
                ", L_statetext='" + L_statetext + '\'' +
                ", L_temp_set='" + L_temp_set + '\'' +
                ", smartstart='" + smartstart + '\'' +
                ", heat_once='" + heat_once + '\'' +
                ", L_offtemp_ac='" + L_offtemp_ac + '\'' +
                ", sensor_on='" + sensor_on + '\'' +
                ", name='" + name + '\'' +
                ", mode_auto='" + mode_auto + '\'' +
                ", L_state='" + L_state + '\'' +
                ", use_boiler_heat='" + use_boiler_heat + '\'' +
                '}';
    }
}
