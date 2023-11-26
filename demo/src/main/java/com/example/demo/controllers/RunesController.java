package com.example.demo.controllers;

import com.example.demo.model.runes.AllRunesData;
import com.example.demo.model.runes.Rune;
import com.example.demo.model.versions.AllVersionsData;
import com.example.demo.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class RunesController{
    @Autowired
    private ApiService apiService;
    private final AllVersionsData versionsData;

    @Autowired
    public RunesController(ApiService apiService) {
        this.versionsData = apiService.fetchVersionData();
    }

    @GetMapping("/runes")
    public String runesMain(Model model){
        String runesVersion=versionsData.getN().getRune();
        AllRunesData runesData = apiService.fetchRunesData("http://ddragon.leagueoflegends.com/cdn/" + runesVersion +"/data/en_US/rune.json");
        //model.addAttribute();
        return "mainRunes";
    }

    @GetMapping("/runes/{rune}")
    public String runesInfo(@PathVariable(value="rune") String name, Model model){
        String runesVersion=versionsData.getN().getRune();
        AllRunesData runesData = apiService.fetchRunesData("http://ddragon.leagueoflegends.com/cdn/" + runesVersion +"/data/en_US/rune.json");
        //Rune
//        if(){
//            return "infoRune";
//        }
//        else{
//            model.addAttribute("message", "Item not found");
//        }
        return null;
    }
}
