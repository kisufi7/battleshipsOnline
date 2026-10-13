package com.kisufi7.BattleshipsOnline.dto;

public class UserDTO {

    private final Long id;
    private final String username;
    private final String password;

    public UserDTO(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public String getpassword() {
        return password;
    }

    public String getusername() {
        return username;
    }

    public Long getId() {
        return id;
    }

}
