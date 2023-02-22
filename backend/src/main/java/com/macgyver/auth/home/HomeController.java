package com.macgyver.auth.home;

import com.macgyver.auth.user.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class HomeController {

    private final HomeService homeService;

    @GetMapping("/home")
    public List<User> sayHello() {
        return homeService.getAllUsers();
    }
}
