package com.patternhub.springbootrestexample.controller;

import com.patternhub.springbootrestexample.dto.UserDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Slf4j
public class HomeController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }

    @PostMapping("/user")
    public ResponseEntity<UserDTO> saveUser(@RequestBody  UserDTO userDTO){
        log.info("hello"+userDTO.getEmail());
        return ResponseEntity.ok().body(userDTO);
    }
}
