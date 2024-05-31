package com.jc.curso.springboot.webapp.springbootweb.controllers;



import java.util.Arrays;
import java.util.List;

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

@GetMapping("/list")
public List<User> list(){

    User user = new User("Juan Carlos", "Martinez");
    User user2 = new User("Pepe", "Doe");
    User user3 = new User("Jhon", "Doe");

    List<User> users = Arrays.asList(user,user2,user3);

    // List <User> users = new ArrayList<>();
    // users.add(user);
    // users.add(user2);
    // users.add(user3);

    return users;
}

}
