package com.example.casestudylibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
/*
 * Home controller
 */
public class HomeController {

    @RequestMapping
    public String index() {
        return "index";
    }
}
