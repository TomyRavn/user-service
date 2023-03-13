package com.example.userservice.vo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RequestLogin {
    @NotNull(message = "Email Cannot be null")
    @Size(min = 2, message = "Email cannot be less than two characters")
    @Email
    private String email;

    @NotNull(message = "Password Cannot be null")
    @Size(min = 8, message = "Password must be equals or greater than 8 characters")
    private String password;
}
