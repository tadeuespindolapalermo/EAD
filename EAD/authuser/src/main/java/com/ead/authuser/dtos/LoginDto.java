package com.ead.authuser.dtos;

import lombok.Data;

import jakarta.validation.constraints.NotBlank;

@Data
public class LoginDto {

    @NotBlank
    private String username;

    @NotBlank
    private String password;
}
