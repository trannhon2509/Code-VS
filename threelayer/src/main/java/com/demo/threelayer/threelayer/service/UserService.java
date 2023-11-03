package com.demo.threelayer.threelayer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.threelayer.threelayer.model.User;
import com.demo.threelayer.threelayer.repository.UserRepository;

@Component
public class UserService implements UserServiceInterface{
    @Autowired
    UserRepository repository;

    @Override
    public List<User> getListUsers() {
        return repository.getUsers();
    }

    @Override
    public User getUserByName(String name) {
        for (User item : repository.getUsers()) {
            if(name.indexOf(name)!=-1){
                return item;
            }
        }
        return null;
    }
    
}
