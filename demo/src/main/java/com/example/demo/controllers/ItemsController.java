package com.example.demo.controllers;

import com.example.demo.model.items.AllItemsData;
import com.example.demo.model.versions.AllVersionsData;
import com.example.demo.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ItemsController {
    @Autowired
    private ApiService apiService;
    private final AllVersionsData versionsData;

    @Autowired
    public ItemsController(ApiService apiService){
        this.versionsData=apiService.fetchVersionData();
    }

    @GetMapping("/items")
    public String itemsMain(Model model){
        String itemsVersion = versionsData.getN().getItem();

        AllItemsData itemsData=apiService.fetchItemsData("http://ddragon.leagueoflegends.com/cdn/"+itemsVersion+"/data/en_US/items.json");
        model.addAttribute("itemsData", itemsData);

        return "mainItems";
    }

    @GetMapping("/items/{item}")
    public String itemsInfo(@PathVariable(value="item") String name, Model model){
        return "infoItem";
    }

}
