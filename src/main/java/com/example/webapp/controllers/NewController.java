package com.example.webapp.controllers;

import com.example.webapp.myClasses.LogIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class NewController {

    @GetMapping("/hellow")
    public String GetHellow() {
        return "hellow.html";
    }

    @GetMapping("/exeption")
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String GetExeption()
    {
        throw new IllegalArgumentException("Какая-то ошибка");
    }

    //Типа обробатываем ошибку, но чёт как-то... Мее. Такое себе
    @GetMapping(value = "/{id}")
    @ResponseBody
    public String findById(@PathVariable("id") String strId, HttpServletResponse response){
        try{
            int id = Integer.valueOf(strId);
            return id+"";
        }catch(Exception e){
            throw new ResponseStatusException(777, "!!!!! "+strId+"? Серьёзно? !!!!!", e);
        }
    }


    @GetMapping("/ResponseEntity")
    public ResponseEntity<String> responseEntity(){
        return ResponseEntity.ok("hellow.html");
    }

    //Лучше так не делать
    @GetMapping("/HttpServletResponse")
    public void string(HttpServletResponse response) throws IOException {
        response.setStatus(200);
        response.getWriter().println("Hello World!");
    }
}
