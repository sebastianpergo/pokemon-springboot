package com.demo.pokemon.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class WebController {
    @GetMapping("/home")
    public String home() {
        return "index";
    }
}
