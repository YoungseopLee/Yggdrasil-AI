package com.example.yggdrasil.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@RequestMapping("/yggdrasil")

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        log.info("LoginController - login() called");

        return "login";
    }

    @GetMapping("/signup")
    public String signup() {
        log.info("LoginController - signup() called");

        return "signup";
    }

    @PostMapping("/signup")
    public String register() {
        log.info("LoginController - register() called");

        return "redirect:/login";
    }

}
