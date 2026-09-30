package com.kisufi7.BattleshipsOnline.controller;


import com.kisufi7.BattleshipsOnline.dto.UserDTO;
import com.kisufi7.BattleshipsOnline.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UIController {
    UserService userService;

    @PostMapping("/api/login")
    public ResponseEntity<String> login(@RequestBody UserDTO userDTO){
         Boolean response = userService.login(userDTO.getUserName(), userDTO.getPassword());  //data sent over to service (i hope CI works properly)
        System.out.println("Anfrage kam im Controller an");
         if(response){
             System.out.println("Anfrage verließ positiv den Controller");
             return new ResponseEntity<String>(HttpStatus.OK);
         }
         else{
             System.out.println("Anfrage verließ negativ den Controller");
             return new ResponseEntity<String>((HttpStatus.BAD_REQUEST));
         }

    }
}
