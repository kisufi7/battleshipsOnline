package com.kisufi7.BattleshipsOnline.dto;

import jakarta.persistence.*;

public class UserDTO {

    private Long id;
    private String userName;
    private String password;

    public UserDTO(Long id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    public Long getId() {
        return id;
    }

}
