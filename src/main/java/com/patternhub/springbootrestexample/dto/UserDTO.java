package com.patternhub.springbootrestexample.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
//@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDTO {
    private String name;
    private String email;
    private long mobile;
    private String password;
}
