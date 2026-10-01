package com.kisufi7.BattleshipsOnline.service;

import com.kisufi7.BattleshipsOnline.entity.Users;
import com.kisufi7.BattleshipsOnline.dto.UserDTO;
import com.kisufi7.BattleshipsOnline.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

@Service
@Slf4j
public class UserService {

    private final UserRepository userRepository;


    //constructor injection
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Boolean login(String username, String password){
        log.info("Anfrage ist im Service");
        if(userRepository.findByUsernameAndPassword(username,password).isEmpty()){
            return false;}
        else return true;
        }

    }



