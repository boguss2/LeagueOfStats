package com.example.demo.controllers;

import com.example.demo.model.profiles.Profile;
import com.example.demo.model.profiles.Summoner;
import com.example.demo.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
public class ProfileController {
    @Autowired
    private ApiService apiService;

    @GetMapping("/profiles")
    public String profilesMain(Model model){

        return "mainProfiles";
    }

    @GetMapping("/profiles/{server}/{tag}/{name}")
    public String profilesInfo(Model model, @PathVariable String name, @PathVariable String server, @PathVariable String tag) throws UnsupportedEncodingException{
        //walidacja danych po wyszukiwaniu + to czy ktos recznie dudusia nie zapodal
        Profile profile = apiService.fetchPlayerId(server, tag, name);
        Summoner summoner = apiService.fetchSummoner(server, profile.getPuuid());
        List<String> matchHistory = apiService.fetchMatchHistory(server, profile.getPuuid());
        for(String match:matchHistory){

        }
        model.addAttribute("profile", profile);
        model.addAttribute("summoner", summoner);
        model.addAttribute("matchHistory", matchHistory);
        return "infoProfile";
    }
}
