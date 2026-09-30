package com.kisufi7.BattleshipsOnline.service;

import com.kisufi7.BattleshipsOnline.entity.Users;
import com.kisufi7.BattleshipsOnline.dto.UserDTO;
import com.kisufi7.BattleshipsOnline.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

@Service
public class UserService {

    private final UserRepository userRepository;


    //constructor injection
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Boolean login(String username, String password){
        System.out.println("Anfrage ist im Service");
        if(userRepository.findByUsernameAndPassword(username,password).isEmpty()){
            return false;}
        else return true;
        }

    }



