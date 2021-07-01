package com.example.webapp.controllers;

import com.example.webapp.myClasses.LogIn;
import com.example.webapp.myClasses.ResponseTransfer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


//@Controller
@RestController
@RequestMapping("/Request/")
public class ControllerClass {

    @GetMapping("hellow")
    public String GetHellow() throws Exception{
        return "hellow.html";
    }

    @GetMapping(value = "{id}")
    public  String findNiId(@PathVariable("id") Long id){
        return "Поиск по id:" +id;
    }


    //Типа обработчик ошибок, который работет только в этом классе
    /*@ExceptionHandler()
    public void handleExeption(){}*/

    @PostMapping("auto")
    public String auto(){
        System.out.println("auto");
        return "hellow.html";
    }

    @PostMapping("login")
        public ResponseEntity logIn(@RequestBody LogIn LI){
        System.out.println("Пользователь: "+LI.email+" "+LI.pasword);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    //@PostMapping("logout")
    //@ResponseBody
    //public ResponseTransfer logOut(@RequestBody LogIn LI){
    //    System.out.println("Пользователь: "+LI.email+" "+LI.pasword);
    //    return new ResponseTransfer("Ну, допустим, мяу. "+ LI.email);
    //}
}
