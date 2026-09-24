package com.kisufi7.BattleshipsOnline.repository;

import com.kisufi7.BattleshipsOnline.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UserRepository extends JpaRepository {

    List<User> findByUsername 

}
