package com.example.jwt_security_example.controller.request;

import lombok.Data;

@Data
public class userAuthRequestDTO {

    private String username;
    private String password;
}
