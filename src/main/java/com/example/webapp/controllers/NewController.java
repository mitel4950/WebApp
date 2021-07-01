package com.example.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NewController {
    @GetMapping("/hellow")
    public String GetHellow() {
        return "hellow.html";
    }

}
