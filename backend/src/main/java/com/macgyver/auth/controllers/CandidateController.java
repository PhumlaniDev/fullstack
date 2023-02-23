package com.macgyver.auth.controllers;

import com.macgyver.auth.dto.UserDTO;
import com.macgyver.auth.models.Candidate;
import com.macgyver.auth.services.CandidateService;
import com.macgyver.auth.services.HomeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class CandidateController {

    private final CandidateService service;
    private final HomeService homeService;

//    @GetMapping("/get")
//    public List<UserDTO> getAllUsers(){
//        return homeService.getAllUsers();
//    }

    @PostMapping("/add")
    public void addCandidate(@RequestBody Candidate candidate) throws Exception {
        try{
            service.addCandidate(candidate);
        } catch (Exception error){
            System.out.println(error.getMessage());
        }

    }
}
