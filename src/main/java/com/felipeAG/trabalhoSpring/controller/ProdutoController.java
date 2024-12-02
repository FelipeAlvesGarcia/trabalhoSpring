package com.felipeAG.trabalhoSpring.controller;

import com.felipeAG.trabalhoSpring.model.Produto;
import com.felipeAG.trabalhoSpring.repository.ProdutoR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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
    public ModelAndView listar (Model model){
        List<Produto> produtos = produtoR.findAll();
        model.addAttribute("produtos", produtos);
        ModelAndView mv = new ModelAndView("produto/produtoL");
        return mv;
    }

    @GetMapping("/criar")
    public ModelAndView criar (Model model){

        ModelAndView mv = new ModelAndView("produto/produtoC");
        return mv;
    }

    @PostMapping("/criar")
    public String criarProduto (@ModelAttribute Produto produto){
        produtoR.save(produto);
        return "redirect:produtos";
    }
}
