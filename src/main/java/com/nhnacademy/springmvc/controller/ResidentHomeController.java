package com.nhnacademy.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResidentHomeController {

    @GetMapping("/")
    public String index() { return "ResidentMain";}
}
