package com.jc.curso.springboot.webapp.springbootweb.controllers;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jc.curso.springboot.webapp.springbootweb.models.User;
import com.jc.curso.springboot.webapp.springbootweb.models.dto.UserDTO;

@RestController
@RequestMapping("/api")
public class UserRestController {

@GetMapping("/details")
public UserDTO details(){

    UserDTO userDTO = new UserDTO();

    User user = new User("Juan Carlos", "Martínez");
    userDTO.setUser(user);
    userDTO.setTitle("Hola Mundo Spring Boot");
   
    return userDTO;
}

}
