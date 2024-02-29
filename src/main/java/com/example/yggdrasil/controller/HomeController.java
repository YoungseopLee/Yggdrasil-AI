package com.example.yggdrasil.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@RequestMapping("/yggdrasil")

@Controller
public class HomeController {

    @GetMapping("/")
    public String defaultPage() {
        return "redirect:/Home";
    }

    @GetMapping("/home")
    public String home() {
        log.info("HomeController - home() called");


        return "home";
    }

    @GetMapping("/discover")
    public String discover() {
        log.info("HomeController - discover() called");

        return "discover";
    }

    @GetMapping("/search")
    public String search() {
        log.info("HomeController - search() called");

        return "search";
    }

    @GetMapping("/mypage")
    public String mypage() {
        log.info("HomeController - mypage() called");

        return "mypage";
    }

    @GetMapping("/cart")
    public String cart() {
        log.info("HomeController - cart() called");

        return "cart";
    }

    @GetMapping("/login")
    public String login() {
        log.info("HomeController - login() called");

        return "login";
    }

}
