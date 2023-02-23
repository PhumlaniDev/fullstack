package com.macgyver.auth.services;

import com.macgyver.auth.dto.UserDTO;
import com.macgyver.auth.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class HomeService {

    private final UserRepository userRepository;

    public List<UserDTO> getAllUsers(){
        return userRepository.findAll()
                .stream()
                .map(customer -> new UserDTO(
                        customer.getId(),
                        customer.getFirstname(),
                        customer.getLastname(),
                        customer.getUsername(),
                        customer.getAuthorities()
                                .stream()
                                .map(GrantedAuthority::getAuthority)
                                .collect(Collectors.toList())
                )).collect(Collectors.toList());

    }
}
