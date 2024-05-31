package com.jc.curso.springboot.webapp.springbootweb.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.jc.curso.springboot.webapp.springbootweb.models.User;

@Controller
public class UserController {

@GetMapping("/details")
public String details(Model model ){

    User user = new User("Juan Carlos", "Martínez");
    user.setEmail("correo@hotmail.com");
    model.addAttribute("title", "Hola Mundo Spring Boot");
    model.addAttribute("user", user);
   
    return "details";
}

@GetMapping("/list")
public String list(ModelMap model){
    List<User> users = new ArrayList<>();

    model.addAttribute("users", users);
    model.addAttribute("title", "Listado de usuarios!");

    return "list";
}

}
