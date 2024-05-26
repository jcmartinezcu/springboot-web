package com.jc.curso.springboot.webapp.springbootweb.models;

public class User {

    private String name;
    private String lastname;

    

    public User(String name, String lastName) {
        this.name = name;
        this.lastname = lastName;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastName) {
        this.lastname = lastName;
    }

    

}
