package com.projet.okofen_control.web.controller;

import com.google.gson.Gson;
import com.projet.okofen_control.dao.*;
import com.projet.okofen_control.model.Oko_chaudiere;
import com.projet.okofen_control.model.Oko_circuitChauffage;
import com.projet.okofen_control.service.ChaudiereService;
import com.projet.okofen_control.web.util.OkoUtil;
import io.swagger.annotations.Api;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

@Api()
@RestController
public class ChaudiereController {

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
    @Autowired
    private ChaudiereService chaudiereService;
    @CrossOrigin
    @RequestMapping(value = "/chaudiere", method = RequestMethod.GET)
    public void getAllParametersValue() throws IOException, ParseException {
        chaudiereService.updateDatas();
    }
    @CrossOrigin
    @RequestMapping(value = "/chaudiere/circuitChauffage", method = RequestMethod.GET)
    public List<Oko_circuitChauffage> getCircuitChauffageData() {
        return oko_circuitChauffageDAO.findAll();
    }
    @CrossOrigin
    @RequestMapping(value = "/chaudiere/all", method = RequestMethod.GET)
    public List<Oko_chaudiere> getAllDatas() {
        return oko_chaudiereDAO.findAll();
    }
}
