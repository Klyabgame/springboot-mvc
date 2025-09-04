package com.franz.springboot.springmvc.app.controllers;

import com.franz.springboot.springmvc.app.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class UserController {

    @GetMapping({"/view","/"})
    public  String view(Model model){
        model.addAttribute("title","Hola Mundo Spring Boot");
        model.addAttribute("message","Esta es una aplicacion de ejemplo usando spring boot");
        model.addAttribute("user", new User("andres","GUZMAN"));
        return "view";
    }
}
