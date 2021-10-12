package com.example.almighty.java.controller;

import com.example.almighty.java.service.UserService;
import com.example.almighty.java.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public List<User> getAll(){
        return userService.findAll();
    }

    @PostMapping("/save")
    public User save(@RequestBody User  user){
       return userService.saveOrUpdate(user);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id){
        return userService.delete(id);
    }

    @GetMapping("/findById/{id}")
    public Optional<User> findById(@PathVariable("id") Long id){
        return userService.findById(id);
    }


}
