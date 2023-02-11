package com.example.SqlRocks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    //as UserRepository is an interface it will create object of the class which implements the interface.

    public String addUser(User user) {
        userRepository.save(user); //inbuild function in JPA
        return "User added to database";
    }

    public User getUser(int id) {
        User user=userRepository.findById(id).get(); //inbuild function in JPA
        return user;
    }




}
