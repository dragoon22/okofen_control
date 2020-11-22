package com.projet.okofen_control.web.controller;

import com.google.gson.Gson;
import com.projet.okofen_control.dao.Oko_userDAO;
import com.projet.okofen_control.model.Oko_circuitChauffage;
import io.swagger.annotations.Api;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

@Api( description="API pour es opérations CRUD sur les produits.")
@RestController

public class ChaudiereController {
    String url = "http://192.168.1.111:4321/vuaO";
    private final String USER__AGENT = "Mozilla/5.0";

    @Autowired
    private Oko_userDAO oko_userDAO;

    @RequestMapping(value = "/chaudiere", method = RequestMethod.GET)
    public JSONObject getAllParametersValue() throws IOException, ParseException {
        URL obj = new URL(url+"/all");
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        //optional default is GET
        con.setRequestMethod("GET");

        //add request header
        con.setRequestProperty("User-Agent", USER__AGENT);

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        JSONParser parser = new JSONParser();
        JSONObject object= (JSONObject) parser.parse(in);
        Oko_circuitChauffage oko_circuitChauffage=new Gson().fromJson(String.valueOf(object.get()),Oko_circuitChauffage.class);
        in.close();

        //print result
        System.out.println(object.toString());
        return object;
    }
}
