package com.example.yggdrasil.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@RequestMapping("/Yggdrasil")

@Controller
public class HomeController {

    @GetMapping("/")
    public String defaultPage() {
        return "redirect:/Home";
    }

    @GetMapping("/Home")
    public String home() {
        log.info("HomeController 테스트 home() called");
        return "home";
    }


}
