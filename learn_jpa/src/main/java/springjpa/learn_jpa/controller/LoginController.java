package springjpa.learn_jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import springjpa.learn_jpa.model.User;
import springjpa.learn_jpa.repository.UserRepository;

@RestController
public class LoginController {

    @Autowired
    UserRepository userRepository;

    
    @GetMapping("/login")
    public ResponseEntity<?> login(){
        
        
        List<User> users = userRepository.findAll();

        return ResponseEntity.ok("success");
    }
}
