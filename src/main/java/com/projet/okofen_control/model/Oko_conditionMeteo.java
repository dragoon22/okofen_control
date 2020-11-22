package com.projet.okofen_control.model;

public class Oko_conditionMeteo {
  private String cloud_limit;
  private String oekomode;
  private String L_temp	;
  private String L_forecast_cloud;
  private String refresh	;
  private String L_location;
  private String L_clouds;
  private String lead;
  private String L_forecast_today;
  private String L_forecast_temp;
  private String L_starttime	;
  private String offtemp	;
  private String L_endtime;
  private String L_source;
  private String hysteresys;

    public String getCloud_limit() {
        return cloud_limit;
    }

    public void setCloud_limit(String cloud_limit) {
        this.cloud_limit = cloud_limit;
    }

    public String getOekomode() {
        return oekomode;
    }

    public void setOekomode(String oekomode) {
        this.oekomode = oekomode;
    }

    public String getL_temp() {
        return L_temp;
    }

    public void setL_temp(String l_temp) {
        L_temp = l_temp;
    }

    public String getL_forecast_cloud() {
        return L_forecast_cloud;
    }

    public void setL_forecast_cloud(String l_forecast_cloud) {
        L_forecast_cloud = l_forecast_cloud;
    }

    public String getRefresh() {
        return refresh;
    }

    public void setRefresh(String refresh) {
        this.refresh = refresh;
    }

    public String getL_location() {
        return L_location;
    }

    public void setL_location(String l_location) {
        L_location = l_location;
    }

    public String getL_clouds() {
        return L_clouds;
    }

    public void setL_clouds(String l_clouds) {
        L_clouds = l_clouds;
    }

    public String getLead() {
        return lead;
    }

    public void setLead(String lead) {
        this.lead = lead;
    }

    public String getL_forecast_today() {
        return L_forecast_today;
    }

    public void setL_forecast_today(String l_forecast_today) {
        L_forecast_today = l_forecast_today;
    }

    public String getL_forecast_temp() {
        return L_forecast_temp;
    }

    public void setL_forecast_temp(String l_forecast_temp) {
        L_forecast_temp = l_forecast_temp;
    }

    public String getL_starttime() {
        return L_starttime;
    }

    public void setL_starttime(String l_starttime) {
        L_starttime = l_starttime;
    }

    public String getOfftemp() {
        return offtemp;
    }

    public void setOfftemp(String offtemp) {
        this.offtemp = offtemp;
    }

    public String getL_endtime() {
        return L_endtime;
    }

    public void setL_endtime(String l_endtime) {
        L_endtime = l_endtime;
    }

    public String getL_source() {
        return L_source;
    }

    public void setL_source(String l_source) {
        L_source = l_source;
    }

    public String getHysteresys() {
        return hysteresys;
    }

    public void setHysteresys(String hysteresys) {
        this.hysteresys = hysteresys;
    }

    @Override
    public String toString() {
        return "Oko_conditionMeteo{" +
                "cloud_limit='" + cloud_limit + '\'' +
                ", oekomode='" + oekomode + '\'' +
                ", L_temp='" + L_temp + '\'' +
                ", L_forecast_cloud='" + L_forecast_cloud + '\'' +
                ", refresh='" + refresh + '\'' +
                ", L_location='" + L_location + '\'' +
                ", L_clouds='" + L_clouds + '\'' +
                ", lead='" + lead + '\'' +
                ", L_forecast_today='" + L_forecast_today + '\'' +
                ", L_forecast_temp='" + L_forecast_temp + '\'' +
                ", L_starttime='" + L_starttime + '\'' +
                ", offtemp='" + offtemp + '\'' +
                ", L_endtime='" + L_endtime + '\'' +
                ", L_source='" + L_source + '\'' +
                ", hysteresys='" + hysteresys + '\'' +
                '}';
    }
}
