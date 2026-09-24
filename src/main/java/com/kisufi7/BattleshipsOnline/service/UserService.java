package com.kisufi7.BattleshipsOnline.service;

import com.kisufi7.BattleshipsOnline.entity.User;
import com.kisufi7.BattleshipsOnline.dto.UserDTO;
import com.kisufi7.BattleshipsOnline.repository.UserRepository;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

@Service
public class UserService {

    private final UserRepository userRepository;


    //constructor injection
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


}
