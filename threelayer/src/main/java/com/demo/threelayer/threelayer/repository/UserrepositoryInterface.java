package com.demo.threelayer.threelayer.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.threelayer.threelayer.model.User;

@Repository
public interface UserrepositoryInterface {
    public List<User> getUsers();
}
