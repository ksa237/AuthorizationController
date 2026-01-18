package ru.netology.sbAuthorization.controller;

import org.springframework.web.bind.annotation.*;
import ru.netology.sbAuthorization.Authorities;
import ru.netology.sbAuthorization.service.AuthorizationService;

import java.util.List;

@RestController
@RequestMapping("/")
public class AuthorizationController {
    private final AuthorizationService service;

    public AuthorizationController(AuthorizationService service) {
        this.service = service;
    }

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@RequestParam("user") String user, @RequestParam("password") String password) {
        return service.getAuthorities(user, password);
    }

    @PostMapping("/add")
    private String add(@RequestParam("user") String user, @RequestParam("password") String password) {
        service.addUser(user, password);
        return String.format("The user %s has been successfully added to the database", user);
    }

}
