package com.projet.okofen_control.web.controller;

import com.google.gson.Gson;
import com.projet.okofen_control.dao.Oko_userDAO;
import com.projet.okofen_control.model.Oko_chaudiere;
import com.projet.okofen_control.model.Oko_circuitChauffage;
import com.projet.okofen_control.web.util.OkoUtil;
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

@Api()
@RestController
public class ChaudiereController {
    String url = "http://192.168.1.111:4321/vuaO";

    @Autowired
    private Oko_userDAO oko_userDAO;

    @RequestMapping(value = "/chaudiere", method = RequestMethod.GET)
    public String getAllParametersValue() throws IOException, ParseException {
        URL obj = new URL(url+"/all");
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        String USER__AGENT = "Mozilla/5.0";
        con.setRequestProperty("User-Agent", USER__AGENT);
        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        JSONParser parser = new JSONParser();
        JSONObject object= (JSONObject) parser.parse(in);
        Oko_chaudiere chaudiere= OkoUtil.getBeanFromJson(object);
        in.close();
        return chaudiere.toString();
    }
}
