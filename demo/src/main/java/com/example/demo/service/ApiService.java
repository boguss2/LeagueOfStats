package com.example.demo.service;

import com.example.demo.model.champions.all.AllChampionsData;
import com.example.demo.model.champions.single.Champion;
import com.example.demo.model.items.AllItemsData;
import com.example.demo.model.profiles.Match;
import com.example.demo.model.profiles.Profile;
import com.example.demo.model.profiles.Summoner;
import com.example.demo.model.runes.AllRunesData;
import com.example.demo.model.versions.AllVersionsData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.UnsupportedEncodingException;
import java.util.List;

@Service
public class ApiService{
    private final RestTemplate restTemplate;
    private final String key="";
    @Autowired
    public ApiService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    public AllChampionsData fetchChampionsData(String apiUrl){
        return restTemplate.getForObject(apiUrl, AllChampionsData.class);
    }
    public Champion fetchChampionData(String apiUrl){
        return restTemplate.getForObject(apiUrl, Champion.class);
    }
    public AllVersionsData fetchVersionData(){
        return restTemplate.getForObject("https://ddragon.leagueoflegends.com/realms/na.json", AllVersionsData.class);
    }

    public AllItemsData fetchItemsData(String apiUrl) {
        return restTemplate.getForObject(apiUrl, AllItemsData.class);
    }

    public AllRunesData fetchRunesData(String apiUrl){
        return restTemplate.getForObject(apiUrl, AllRunesData.class);
    }

    public Profile fetchPlayerId(String region, String tag, String name) throws UnsupportedEncodingException {
        //dodac opcje zmiany serwera
        String regionName="europe";

        String apiUrl ="https://"+regionName + ".api.riotgames.com/riot/account/v1/accounts/by-riot-id/"+name+"/"+tag+"?api_key="+key;

        return restTemplate.getForObject(apiUrl, Profile.class);
    }

    public Summoner fetchSummoner(String region, String puuid){
        //dodanie serwerow
        String server="eun1";

        String apiUrl="https://"+server+".api.riotgames.com/lol/summoner/v4/summoners/by-puuid/"+puuid+"?api_key="+key;
        return restTemplate.getForObject(apiUrl, Summoner.class);
    }

    public List fetchMatchHistory(String region, String puuid){
        //dodanie serwerow
        String regionName="europe";

        //trzeba ogarnac dzialanie wartosci z tej tabeli(typy itd) zeby nauczyc sie dodawac query
        String apiUrl="https://"+regionName+".api.riotgames.com/lol/match/v5/matches/by-puuid/"+puuid+"/ids?start=0&count=20&api_key="+key;
        return restTemplate.getForObject(apiUrl, List.class);
    }

    public Match fetchMatch(String region, String matchId){
        //dodanie serwerow
        String regionName="europe";

        String apiUrl="https://"+regionName+".api.riotgames.com/lol/match/v5/matches/"+matchId+"?api_key="+key;
        return restTemplate.getForObject(apiUrl, Match.class);
    }
}
