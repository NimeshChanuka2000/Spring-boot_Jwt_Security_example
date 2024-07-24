package com.example.jwt_security_example.controller.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserLoginResponseDTO {

    private String token;
}
