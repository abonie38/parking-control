package com.api.parkingcontrol.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewsController {
    @GetMapping("/")
    public String getLista(){
        return "lista";
    }
}
