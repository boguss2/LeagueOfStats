package com.example.demo.controllers;

import com.example.demo.model.champions.all.AllChampionsData;
import com.example.demo.model.champions.all.Champion;
import com.example.demo.model.champions.single.ChampionData;
import com.example.demo.model.champions.single.ChampionDetails;
import com.example.demo.model.versions.AllVersionsData;
import com.example.demo.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import static org.springframework.util.StringUtils.capitalize;

@Controller
public class ChampionsController {
    @Autowired
    private ApiService apiService;

    @GetMapping("/champions")
    public String championsMain(){
        return "mainChampions";
    }

    @GetMapping("/champions/{champion}")
    public String championsInfo(@PathVariable(value="champion") String name, Model model){

        //POBRANIE DANYCH Z API(wersja jest pobierana z NA)
        AllVersionsData versionsData = apiService.fetchVersionData();
        String championsVersion = versionsData.getN().getChampion();

        AllChampionsData championsData=apiService.fetchChampionsData("http://ddragon.leagueoflegends.com/cdn/"+championsVersion+"/data/en_US/champion.json");

        if(championsData.findChampion(name)!=null){
            String formatedName= capitalize(name);
            ChampionData championData= apiService.fetchChampionData("https://ddragon.leagueoflegends.com/cdn/"+championsVersion+"/en_US/champion/"+formatedName+".json");
            ChampionDetails championDetails = championData.findChampion(formatedName);
            model.addAttribute();

            return "infoChampion";
        }
        else{
            model.addAttribute("message", "Champion not found");
            return "mainChampions";
        }
    }
}