package com.felipeAG.trabalhoSpring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/produto")
public class produtoController {

    @GetMapping
    public ModelAndView produto (){
        ModelAndView mv = new ModelAndView("produto/produto");
        return mv;
    }

    @GetMapping("/listar")
    public ModelAndView listar (){
        ModelAndView mv = new ModelAndView("produto/listar");
        return mv;
    }
}
