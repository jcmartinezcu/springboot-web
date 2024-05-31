package com.jc.curso.springboot.webapp.springbootweb.models;

public class User {

    private String name;
    private String lastname;
    private String email;

    

    public User() {
    }
    
    public User(String name, String lastname, String email) {
        this(name, lastname);
        this.email = email;
    }
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    

    

}
