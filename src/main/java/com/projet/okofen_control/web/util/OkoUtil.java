package com.projet.okofen_control.web.util;

import com.google.gson.Gson;
import com.projet.okofen_control.model.*;
import org.json.simple.JSONObject;

public class OkoUtil {

    public static Oko_chaudiere getBeanFromJson(JSONObject jsonObject){
        Oko_chaudiere chaudiere = new Oko_chaudiere();
        Gson gson=new Gson();
        Oko_circuitChauffage oko_circuitChauffage =gson.fromJson(String.valueOf(jsonObject.get("hk1")),Oko_circuitChauffage.class);
        Oko_circuitECS oko_circuitECS=gson.fromJson(String.valueOf(jsonObject.get("ww1")),Oko_circuitECS.class);
        Oko_circuitSolaire oko_circuitSolaire=gson.fromJson(String.valueOf(jsonObject.get("sk1")),Oko_circuitSolaire.class);
        Oko_conditionMeteo oko_conditionMeteo=gson.fromJson(String.valueOf(jsonObject.get("weather")),Oko_conditionMeteo.class);
        Oko_donnéeStirling oko_donneeStirling=gson.fromJson(String.valueOf(jsonObject.get("stirling")),Oko_donnéeStirling.class);
        Oko_gainSolaire oko_gainSolaire=gson.fromJson(String.valueOf(jsonObject.get("se1")),Oko_gainSolaire.class);
        Oko_pompeCirculation oko_pompeCirculation=gson.fromJson(String.valueOf(jsonObject.get("circ1")),Oko_pompeCirculation.class);
        Oko_previsionMeteo oko_previsionMeteo=gson.fromJson(String.valueOf(jsonObject.get("forecast")),Oko_previsionMeteo.class);
        Oko_puissance oko_puissance=gson.fromJson(String.valueOf(jsonObject.get("power1")),Oko_puissance.class);
        Oko_systeme oko_systeme=gson.fromJson(String.valueOf(jsonObject.get("system")),Oko_systeme.class);

        chaudiere.setOko_circuitChauffage(oko_circuitChauffage);
        chaudiere.setOko_circuitECS(oko_circuitECS);
        // chaudiere.setOko_circuitSolaire(oko_circuitSolaire);
        chaudiere.setOko_conditionMeteo(oko_conditionMeteo);
        // chaudiere.setOko_donnéeStirling(oko_donnéeStirling);
        // chaudiere.setOko_gainSolaire(oko_gainSolaire);
        chaudiere.setOko_pompeCirculation(oko_pompeCirculation);
        // chaudiere.setOko_previsionMeteo(oko_previsionMeteo);
        // chaudiere.setOko_puissance(oko_puissance);
        chaudiere.setOko_systeme(oko_systeme);

        return chaudiere;
    }
}
