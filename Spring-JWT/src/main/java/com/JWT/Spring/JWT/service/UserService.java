package com.JWT.Spring.JWT.service;

import com.JWT.Spring.JWT.module.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private  List<User> store=new ArrayList<>();

    public List<String> name=new ArrayList<String>();

    public UserService(){
        store.add(new User("44","arif","arif@gmai"));
        store.add(new User(UUID.randomUUID().toString(),"Arifur","arif@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"zarif","zarif@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"razib","razib@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"xenon","xenon@gmail.com"));
    }

    public  List<User> getUser(){
        return this.store;
    }

}
