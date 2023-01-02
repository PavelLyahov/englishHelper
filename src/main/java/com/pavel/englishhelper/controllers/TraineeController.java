package com.pavel.englishhelper.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TraineeController {

    @RequestMapping("/trainee")
    public String home(Model page) {
        page.addAttribute("username", "Pavel");
        page.addAttribute("color", "red");
        return "trainee.html";
    }
}
