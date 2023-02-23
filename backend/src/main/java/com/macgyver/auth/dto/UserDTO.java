package com.macgyver.auth.dto;

import java.util.List;

public record UserDTO(
        Long id,
        String firtsname,
        String lastname,
        String email,
        List<String> role
){
}
