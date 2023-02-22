package com.phumlanidev.backend.candidate;

import com.phumlanidev.backend.home.HomeService;
import com.phumlanidev.backend.user.User;
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

    @GetMapping("/get")
    public List<User> getAllUsers(){
        return homeService.getAllUsers();
    }

    @PostMapping("/add")
    public void addCandidate(@RequestBody Candidate candidate) throws Exception {
        service.addCandidate(candidate);
    }
}
