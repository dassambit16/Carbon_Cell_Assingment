package com.carbonCell.carbonCell.Model.Dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginDTO {

    @NotBlank(message = "Email is mandatory")
    @Email(message = "Invalid email address")
    private String email;

    @NotBlank(message = "Password is mandatory")
    private String password;
}
