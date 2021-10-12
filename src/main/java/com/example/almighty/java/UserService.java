package com.example.almighty.java;

import com.example.almighty.java.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    List<User> findAll(){
      return   userRepository.findAll();
    }

    public User saveOrUpdate(User user){
        return userRepository.save(user);
    }

    public Optional<User> findById(Long id){
        return userRepository.findById(id);
    }

    public String delete(Long id){
        userRepository.deleteById(id);
        return "{'message': 'User Deleted Successfully'}";
    }

}
