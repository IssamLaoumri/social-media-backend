package com.laoumri.socialmediabackend.dto.requests;

import jakarta.validation.constraints.Email;

public class SigninRequest {
    @Email
    private String email;
    private String password;
}
