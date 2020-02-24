package com.infosys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.apache.commons.codec.digest.DigestUtils;

import com.infosys.model.User;

import java.util.List;

import javax.servlet.http.HttpSession;


import com.infosys.services.Userservice;


@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {

    @Autowired
    private Userservice us;

    @PostMapping("/create")
    public User create(@RequestBody User user) {
        return us.create(user);
    }

    @GetMapping("/all")
    public List<User> getAllUser() {
        return us.findAllUsers();

    }

    @GetMapping("/getbyusername/{username}")
    public User getbyusername(@PathVariable String username){
        return us.findbyUsername(username);
    }
    @PostMapping("/login")
    public User login(@RequestBody User user, HttpSession session) {
        String password = DigestUtils.sha256Hex(user.getPassword());
        for (User u : us.findAllUsers()) {

        if(user.getUsername().equals(u.getUsername())){
            if (user.getPassword().equals(password)){
                session.setAttribute("user", user);
                return user;
        }   

    }   else {
        User invalidUser = null;
        return invalidUser;
    }
}
        return null;
}
}
