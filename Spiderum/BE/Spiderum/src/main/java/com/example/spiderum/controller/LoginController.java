package com.example.spiderum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginController {

    

    @GetMapping("/")
    public ResponseEntity<?> getUsers() {
        
        return ResponseEntity.ok("asdasdfas");
    }
}
