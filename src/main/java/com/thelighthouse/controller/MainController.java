package com.thelighthouse.controller;

import com.thelighthouse.DataBase;
import com.thelighthouse.Player;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class MainController {


    @GetMapping()
    public String loadMain(Model model) {

        model.addAttribute("logo", "The Lighthouse");

        return "mainMenu";
    }

    @GetMapping("/players")
    public String listAllUsers(Model model) {
        ArrayList<Player> playerList = DataBase.getPlayerList();
        model.addAttribute("playerList", playerList);
        return "players";
    }


}
