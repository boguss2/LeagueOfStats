package com.example.demo.controllers;

import com.example.demo.model.champions.AllChampionsData;
import com.example.demo.model.champions.Champion;
import com.example.demo.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

@Controller
public class ChampionsController {
    @Value("${lol.version}")
    private String version;

    private String apiUrl = "http://ddragon.leagueoflegends.com/cdn/"+version+"/en_US/";
    @Autowired
    private ApiService apiService;

    @GetMapping("/champions")
    public String championsMain(){
        return "mainChampions";
    }

    @GetMapping("/champions/{champion}")
    public String championsInfo(@PathVariable(value="champion") String name, Model model){

        //POBRANIE DANYCH Z API
        AllChampionsData data=apiService.fetchData("http://ddragon.leagueoflegends.com/cdn/"+version+"/data/en_US/champion.json");
        Champion champion = data.findChampion(name);

        if(champion!=null){
            model.addAttribute("champion", champion);
            return "infoChampion";
        }
        else{
            model.addAttribute("message", "Champion not found");
            return "mainChampions";
        }
    }
}