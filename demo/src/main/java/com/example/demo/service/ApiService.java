package com.example.demo.service;

import com.example.demo.model.champions.AllChampionsData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class ApiService{
    private final RestTemplate restTemplate;
    @Autowired
    public ApiService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    public AllChampionsData fetchData(String apiUrl){
        return restTemplate.getForObject(apiUrl, AllChampionsData.class);
    }


}
