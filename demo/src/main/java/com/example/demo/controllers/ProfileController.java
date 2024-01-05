package com.example.demo.controllers;

import com.example.demo.model.profiles.Match;
import com.example.demo.model.profiles.Profile;
import com.example.demo.model.profiles.Summoner;
import com.example.demo.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
        List<Match> matches = matchHistory.stream()
                .map(match -> apiService.fetchMatch(server, match))
                .collect(Collectors.toList());

        List<Integer> ownerIndex = new ArrayList<>();
        int i;
        for(Match match : matches){
            i=0;
            for(String id : match.getMetadata().getParticipants()){
                i++;
                if(id.equals(profile.getPuuid())){
                    ownerIndex.add(i);
                }
            }
        }

        model.addAttribute("profile", profile);
        model.addAttribute("summoner", summoner);
        model.addAttribute("matchHistory", matchHistory);
        model.addAttribute("matches", matches);
        model.addAttribute("ownerIndex", ownerIndex);
        return "infoProfile";
    }

    @GetMapping("/profiles/match/{server}/{puuid}/{matchId}")
    public String matchInfo(Model model,@PathVariable String puuid ,@PathVariable String matchId, @PathVariable String server){
        Match match = apiService.fetchMatch(server, matchId);
        int oId = 0;
        int i=0;
        for(String id : match.getMetadata().getParticipants()){
            i++;
            if(id.equals(puuid)){
                oId=i;
            }
        }

        model.addAttribute("match", match);
        model.addAttribute("ownderIndex", oId);
        return "infoMatch";
    }
}
