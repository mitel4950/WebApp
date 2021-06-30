package com.example.webapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/controller")
public class ControllerClass {
    @GetMapping("/hellow")
    public String GetHellow(){
        return "controller/hellow.html";
    }

    @GetMapping(value = "/{id}")
    public  String findNiId(@PathVariable("id") Long id){
        return "Поиск по id:" +id;
    }
}
