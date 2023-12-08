package com.example.demo.controllers;

import com.example.demo.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProfileController {
    @Autowired
    private ApiService apiService;

    @GetMapping("/profiles")
    public String profilesMain(Model model){

        return "mainProfiles";
    }

    @GetMapping("/profiles/{server}/{tag}/{name}")
    public String profilesInfo(Model model, @PathVariable String name, @PathVariable String server, @PathVariable String tag){

        return "infoProfile";
    }
}
