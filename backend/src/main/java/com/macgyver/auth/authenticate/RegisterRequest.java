package com.macgyver.auth.authenticate;


import com.macgyver.auth.user.Role;
import com.macgyver.auth.validator.ValidEnum;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {


    @NotBlank(message = "First Name is required")
    private String firstname;
    @NotBlank(message = "Last Name is required")
    private String lastname;
    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email address")
    private String email;
//    @NotNull
//    @ValidEnum(enumClass = Role.class)
//    @Enumerated(EnumType.STRING)
//    private Role role;
    @NotBlank(message = "Password is required")
    private String password;
}