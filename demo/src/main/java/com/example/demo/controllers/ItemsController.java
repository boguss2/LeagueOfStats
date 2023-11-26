package com.example.demo.controllers;

import com.example.demo.model.champions.all.AllChampionsData;
import com.example.demo.model.champions.single.Champion;
import com.example.demo.model.items.AllItemsData;
import com.example.demo.model.versions.AllVersionsData;
import com.example.demo.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import static org.springframework.util.StringUtils.capitalize;

@Controller
public class ItemsController {
    @Autowired
    private ApiService apiService;
    private final AllVersionsData versionsData;

    @Autowired
    public ItemsController(ApiService apiService) {
        this.versionsData = apiService.fetchVersionData();
    }

    @GetMapping("/items")
    public String itemsMain(Model model) {
        String itemsVersion = versionsData.getN().getItem();

        AllItemsData itemsData = apiService.fetchItemsData("http://ddragon.leagueoflegends.com/cdn/" + itemsVersion + "/data/en_US/item.json");

        model.addAttribute("itemsData", itemsData.getData());
        return "mainItems";
    }

    @GetMapping("/items/{item}")
    public String itemsInfo(@PathVariable(value = "item") String name, Model model) {

        //POBRANIE DANYCH Z API(wersja jest pobierana z NA)
        String itemsVersion = versionsData.getN().getItem();

        AllChampionsData championsData = apiService.fetchChampionsData("http://ddragon.leagueoflegends.com/cdn/" + itemsVersion + "/data/en_US/item.json");

        if (championsData.findChampion(name) != null) {
            String formatedName = capitalize(name);
//            Item item = apiService.fetchChampionData("https://ddragon.leagueoflegends.com/cdn/" + itemsVersion + "/data/en_US/item/" + formatedName + ".json");

//            //dodac do modelu wszystko do porownania
//            model.addAttribute("championData", champion.getChampionData(formatedName));
//            model.addAttribute("championImage", champion.getChampionData(formatedName).getImage());
//            model.addAttribute("championSkins", champion.getChampionData(formatedName).getSkins());
//            model.addAttribute("championInfo", champion.getChampionData(formatedName).getInfo());
//            model.addAttribute("championStats", champion.getChampionData(formatedName).getStats());
//            model.addAttribute("championSpells", champion.getChampionData(formatedName).getSpells());
//            model.addAttribute("championPassive", champion.getChampionData(formatedName).getPassive());

            return "infoItem";
        } else {
            model.addAttribute("message", "Item not found");
            return "mainItems";
        }
   }
}
