package com.felipeAG.trabalhoSpring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class homeController {
    @GetMapping
    public ModelAndView home (){
        ModelAndView mv = new ModelAndView("home/index");
        return mv;
    }
}
