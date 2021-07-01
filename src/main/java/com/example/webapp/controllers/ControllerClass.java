package com.example.webapp.controllers;

import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//@Controller
@RestController
@RequestMapping("/Request/")
public class ControllerClass {

    @GetMapping("hellow")
    public String GetHellow(){
        //FileSystemResource resource = new FileSystemResource(ControllerClass.class.getResource("/res/path/to/the/file/myFile.xsd").getPath());
        return "hellow.html";
    }

    @GetMapping(value = "{id}")
    public  String findNiId(@PathVariable("id") Long id){
        return "Поиск по id:" +id;
    }

}
