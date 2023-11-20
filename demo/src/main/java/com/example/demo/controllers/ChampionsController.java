package com.example.demo.controllers;

import com.example.demo.model.Champion;
import com.example.demo.service.JsonReader;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ChampionsController {
    @Value("${lol.version}")
    private String version;
    private String apiUrl = "http://ddragon.leagueoflegends.com/cdn/"+version+"/en_US/";

    private JsonReader jsonReader;

    @GetMapping("/champions")
    public String championsMain(){
        return "mainChampions";
    }

    @GetMapping("/champions/{champion}")
    public String championsInfo(@PathVariable(value="champion") String champion, Model model){
            //model.addAttribute("champion", champion);

            //POBRANIE DANYCH Z API
            Champion champion1=jsonReader.getChampion(apiUrl, champion);

            return "infoChampion";
    }
}