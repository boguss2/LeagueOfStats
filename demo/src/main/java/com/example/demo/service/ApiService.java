package com.example.demo.service;

import com.example.demo.model.champions.all.AllChampionsData;
import com.example.demo.model.champions.single.Champion;
import com.example.demo.model.versions.AllVersionsData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiService{
    private final RestTemplate restTemplate;
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
}
