package com.kisufi7.BattleshipsOnline.dto;

import jakarta.persistence.*;

public class UserDTO {

    private Long id;
    private String username;
    private String password;

    public UserDTO(Long id, String userName, String password) {
        this.id = id;
        this.username = userName;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return username;
    }

    public Long getId() {
        return id;
    }

}
