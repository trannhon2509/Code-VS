package com.demo.threelayer.threelayer.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.demo.threelayer.threelayer.exception.ResponeException;
import com.demo.threelayer.threelayer.model.User;
import com.demo.threelayer.threelayer.service.UserServiceInterface;

@RestController
public class UserController {
    
    @Autowired
    UserServiceInterface service;
    
    @GetMapping("/users")
    public ResponseEntity<?> getUsers(){
        List<User> list = service.getListUsers();
        return new ResponseEntity<>(list, HttpStatus.ACCEPTED);
    }
    @GetMapping("/{name}")
    public ResponseEntity<?> getUserName(@PathVariable(name = "name") String name) {
        User user = service.getUserByName(name);
        if(user == null){
            ResponeException exception = new ResponeException(new Date(), "User", "Can not find user");
            return new ResponseEntity<>(exception, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(user, HttpStatus.FOUND);
    }
}
