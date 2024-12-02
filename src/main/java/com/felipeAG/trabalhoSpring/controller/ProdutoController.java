package com.felipeAG.trabalhoSpring.controller;

import com.felipeAG.trabalhoSpring.model.Produto;
import com.felipeAG.trabalhoSpring.repository.ProdutoR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @GetMapping
    public ModelAndView produto (){
        ModelAndView mv = new ModelAndView("produto/produto");
        return mv;
    }

    @Autowired
    private ProdutoR produtoR;

    @GetMapping("/listar")
    public String listar (Model model){
        List<Produto> produtos = produtoR.findAll();
        model.addAttribute("produtos", produtos);
        return "produtos";
    }
}
