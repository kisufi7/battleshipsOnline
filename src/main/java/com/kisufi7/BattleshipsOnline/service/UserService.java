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

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Boolean login(String username, String password){
        if(userRepository.findByUsernameAndPassword(username,password).isEmpty()){
            return false;}
        else return true;
        }

        public Boolean register(String username, String password){
        Users user = new Users();
        user.setId(null);
        user.setUserName(username);
        user.setPassword(password);
        userRepository.save(user);
        if (user.getId().equals(null)){
            return false;
        }
        else return true;
        }

    }



