package com.example.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/swagger/")
public class ControllerSwagger {

    @GetMapping("one")
    public String GetHellow(){
        return "hellow.html";
    }

}
