package com.example.demo.controllers;

import com.example.demo.model.champions.all.AllChampionsData;
import com.example.demo.model.champions.single.Champion;
import com.example.demo.model.champions.single.ChampionData;
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
            Champion champion= apiService.fetchChampionData("https://ddragon.leagueoflegends.com/cdn/"+championsVersion+"/data/en_US/champion/"+formatedName+".json");

            //dodac do modelu wszystko do porownania
            model.addAttribute("championData", champion.getChampionData(formatedName));

            return "infoChampion";
        }
        else{
            model.addAttribute("message", "Champion not found");
            return "mainChampions";
        }
    }

    @GetMapping("/champions/{champion1}/vs/{champion2}")
    public String championsCompare(@PathVariable(value="champion1") String name1, @PathVariable(value="champion2") String name2, Model model){

        //POBRANIE DANYCH Z API(wersja jest pobierana z NA)
        AllVersionsData versionsData = apiService.fetchVersionData();
        String championsVersion = versionsData.getN().getChampion();

        AllChampionsData championsData=apiService.fetchChampionsData("http://ddragon.leagueoflegends.com/cdn/"+championsVersion+"/data/en_US/champion.json");
        if(championsData.findChampion(name1)!=null && championsData.findChampion(name2)!=null){
            String formatedName1= capitalize(name1);
            Champion champion1 = apiService.fetchChampionData("https://ddragon.leagueoflegends.com/cdn/"+championsVersion+"/data/en_US/champion/"+formatedName1+".json");

            String formatedName2=capitalize(name2);
            Champion champion2 = apiService.fetchChampionData("https://ddragon.leagueoflegends.com/cdn/"+championsVersion+"/data/en_US/champion/"+formatedName2+".json");

            //dodac do modelu wszystko do porownania

            return "compareChampions";
        }
        else{
            model.addAttribute("message", "One of the champions to comparsion not found");
            return "mainChampions";
        }
    }
}