package com.example.webapp.controllers;

import com.example.webapp.myClasses.LogIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequestMapping("/Request/")
public class ControllerClass {

    @GetMapping("hellow")
    public String GetHellow(){
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

    @GetMapping("RequestHeader")
    public  String funHeader(@RequestHeader("name") String name)
    {
        return name;
    }

    static  String res;
    @GetMapping("listHeaders")
    public ResponseEntity<String> listAllHeaders(@RequestHeader Map<String, String> headers) {
        res = "";
        headers.forEach((key, value) -> res += String.format("Header '%s' = %s \n", key, value));
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

    @GetMapping("nonRequiredHeader")
    public ResponseEntity<String> evaluateNonRequiredHeader(
            @RequestHeader(value = "optional-header", required = false) String optionalHeader) {
        return new ResponseEntity<String>(String.format(
                "Was the optional header present? %s!",
                (optionalHeader == null ? "No" : "Yes")),HttpStatus.OK);
    }

    @ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
    @GetMapping("default")
    public ResponseEntity<String> evaluateDefaultHeaderValue(@RequestHeader(value = "optional-header", defaultValue = "3600") int optionalHeader) {
        return new ResponseEntity<>(String.format("Optional Header is %d", optionalHeader), HttpStatus.OK);
    }




}
