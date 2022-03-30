package com.thelighthouse.controller;

import com.thelighthouse.DataBase;
import com.thelighthouse.Player;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class MainController {


    @GetMapping("/")
    public String loadMain(Model model) {
        model.addAttribute("logo", "The Lighthouse");
        return "mainMenu/mainMenu";
    }

    @GetMapping("/newGame")
    public String newGame(Model model) {
        ArrayList<Player> playerList = DataBase.getPlayerList();
        model.addAttribute("playerList", playerList);
        return "mainMenu/newGame";
    }

    @GetMapping("/createCharacter")
    public String createCharacter(Model model) {
String name = "noname";

        ArrayList<String> storyList = DataBase.getStoryList();
        model.addAttribute("text0",storyList.get(0));
        model.addAttribute("text1", storyList.get(1));
        model.addAttribute("text2", storyList.get(2));
        model.addAttribute("text3", storyList.get(3));
        model.addAttribute("text4", storyList.get(4));
        model.addAttribute("text5", storyList.get(5));
        model.addAttribute("text6", storyList.get(6));

        model.addAttribute("name", name);

        return "createCharacter/createCharacter";
    }
}
