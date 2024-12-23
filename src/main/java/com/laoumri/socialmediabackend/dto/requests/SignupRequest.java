package com.laoumri.socialmediabackend.dto.requests;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SignupRequest {
    @Size(min = 2, max = 50)
    private String firstname;

    @Size(min = 2, max = 50)
    private String lastname;

    @Email
    private String email;

    @Size(min = 6, max = 50)
    private String password;

    @Range(min = 1, max = 31)
    private String bDay;

    @Range(min = 1, max = 31)
    private String bMonth;

    @Range(min = 1920)
    private String bYear;

    private String gender;

    public enum Enum {
        YES
    }
}
