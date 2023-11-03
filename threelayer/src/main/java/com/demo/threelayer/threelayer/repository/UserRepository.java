package com.demo.threelayer.threelayer.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.demo.threelayer.threelayer.model.User;

@Component
public class UserRepository implements UserrepositoryInterface{

    @Override
    public List<User> getUsers() {
        List<User> users = new ArrayList<User>();
        users.add(new User("Nhơn", 20, "duynhon"));
        users.add(new User("Dung", 20, "thuydung"));
        return users;
    }
    
}
