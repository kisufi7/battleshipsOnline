package com.kisufi7.BattleshipsOnline.controller;
import lombok.extern.slf4j.Slf4j;
import com.kisufi7.BattleshipsOnline.dto.UserDTO;
import com.kisufi7.BattleshipsOnline.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/")
public class UIController {

    private final UserService userService;

    public UIController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody UserDTO userDTO){
        Boolean response = userService.login(userDTO.getuserName(), userDTO.getpassword());  //data sent over to service (i hope CI works properly)
         if(response){
             return new ResponseEntity<String>("Anfrage war positiv", HttpStatus.OK);
         }
         else{
             return new ResponseEntity<String>("Anfrage war negativ, rasclaat",HttpStatus.BAD_REQUEST);
         }

    }
}
