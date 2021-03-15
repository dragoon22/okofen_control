package com.projet.okofen_control.service;

import com.google.gson.Gson;
import com.projet.okofen_control.dao.*;
import com.projet.okofen_control.model.*;
import com.projet.okofen_control.web.util.OkoUtil;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@Service
public class ChaudiereService {
    String url = "http://192.168.1.111:4321/vuaO";


    @Autowired
    private Oko_userDAO oko_userDAO;
    @Autowired
    private Oko_chaudiereDAO oko_chaudiereDAO;
    @Autowired
    private Oko_circuitChauffageDAO oko_circuitChauffageDAO;
    @Autowired
    private Oko_circuitECSDAO oko_circuitECSDAO;
    @Autowired
    private Oko_systemDAO oko_systemDAO;

    public void updateDatas() throws IOException, ParseException {
        URL obj = new URL(url+"/all");
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        String USER__AGENT = "Mozilla/5.0";
        con.setRequestProperty("User-Agent", USER__AGENT);
        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);
        //headers.append('Access-Control-Allow-Origin', 'http://localhost:3000');

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        JSONParser parser = new JSONParser();
        JSONObject object= (JSONObject) parser.parse(in);


        createChaudiere(object);
        in.close();
    }


    private void createChaudiere(JSONObject jsonObject){
        Oko_chaudiere chaudiere=null;
        if(!oko_chaudiereDAO.existsById(1)) {
            chaudiere = new Oko_chaudiere();
        }else{
            chaudiere = oko_chaudiereDAO.getOne(1);

        }
        Gson gson=new Gson();


        Oko_circuitChauffage oko_circuitChauffage =gson.fromJson(String.valueOf(jsonObject.get("hk1")),Oko_circuitChauffage.class);
        Oko_circuitECS oko_circuitECS=gson.fromJson(String.valueOf(jsonObject.get("ww1")),Oko_circuitECS.class);
        Oko_circuitSolaire oko_circuitSolaire=gson.fromJson(String.valueOf(jsonObject.get("sk1")),Oko_circuitSolaire.class);
        Oko_conditionMeteo oko_conditionMeteo=gson.fromJson(String.valueOf(jsonObject.get("weather")),Oko_conditionMeteo.class);
        Oko_donneeStirling oko_donneeStirling=gson.fromJson(String.valueOf(jsonObject.get("stirling")),Oko_donneeStirling.class);
        Oko_gainSolaire oko_gainSolaire=gson.fromJson(String.valueOf(jsonObject.get("se1")),Oko_gainSolaire.class);
        Oko_pompeCirculation oko_pompeCirculation=gson.fromJson(String.valueOf(jsonObject.get("circ1")),Oko_pompeCirculation.class);
        Oko_previsionMeteo oko_previsionMeteo=gson.fromJson(String.valueOf(jsonObject.get("forecast")),Oko_previsionMeteo.class);
        Oko_puissance oko_puissance=gson.fromJson(String.valueOf(jsonObject.get("power1")),Oko_puissance.class);
        Oko_systeme oko_systeme=gson.fromJson(String.valueOf(jsonObject.get("system")),Oko_systeme.class);

        oko_circuitChauffage.setChaudiere(chaudiere);
        oko_circuitECS.setChaudiere(chaudiere);
        //oko_circuitSolaire.setChaudiere(chaudiere);
        //oko_conditionMeteo.setChaudiere(chaudiere);
        //oko_donneeStirling.setChaudiere(chaudiere);
        //oko_pompeCirculation.setChaudiere(chaudiere);
        //oko_previsionMeteo.setChaudiere(chaudiere);
       // oko_puissance.setChaudiere(chaudiere);
        oko_systeme.setChaudiere(chaudiere);
        chaudiere.getOko_circuitChauffage().add(oko_circuitChauffage);
        chaudiere.getOko_circuitECS().add(oko_circuitECS);
        chaudiere.getOko_circuitSolaire().add(oko_circuitSolaire);
        chaudiere.getOko_conditionMeteo().add(oko_conditionMeteo);
        chaudiere.getOko_donneeStirling().add(oko_donneeStirling);
        chaudiere.getOko_gainSolaire().add(oko_gainSolaire);
        chaudiere.getOko_pompeCirculation().add(oko_pompeCirculation);
        chaudiere.getOko_previsionMeteo().add(oko_previsionMeteo);
        chaudiere.getOko_puissance().add(oko_puissance);
        chaudiere.getOko_systeme().add(oko_systeme);

        oko_chaudiereDAO.save(chaudiere);
    }


}
