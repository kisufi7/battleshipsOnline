package com.kisufi7.BattleshipsOnline.dto;

public class UserDTO {

    private Long id;
    private String username;
    private String password;

    public UserDTO(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public String getpassword() {
        return password;
    }

    public String getuserName() {
        return username;
    }

    public Long getId() {
        return id;
    }

}
