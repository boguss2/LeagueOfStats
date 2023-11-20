package com.example.demo.service;

import com.example.demo.model.Champion;
import org.springframework.stereotype.Service;

@Service
public class JsonReader {
    public Champion getChampion(String apiUrl, String name){

        return new Champion();
    }
}
