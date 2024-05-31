package com.jc.curso.springboot.webapp.springbootweb.controllers;


import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

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
    

    // model.addAttribute("users", user);
    model.addAttribute("title", "Listado de usuarios!");

    return "list";
}

@ModelAttribute("users")
public List<User> userModels(){
    return Arrays.asList(
        new User("Pepa","Gonzalez"),
        new User("Lalo","Perez","lalo@correo.com"),
        new User("Juanita","Roe","juana@correo.com"),
        new User("Andres","Doe")
    );
}

}
