package com.cicdwithgithubactions.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeClass {

    @GetMapping("/welcome")
    public String retrunString(){
        return "WELCOME TO CICD WITH GITHUB ACTIONS";
    }
}
