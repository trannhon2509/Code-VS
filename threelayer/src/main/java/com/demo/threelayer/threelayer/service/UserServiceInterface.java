package com.demo.threelayer.threelayer.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.demo.threelayer.threelayer.model.User;

@Service
public interface UserServiceInterface {
    public List<User> getListUsers();

    public User getUserByName(String name);
}
