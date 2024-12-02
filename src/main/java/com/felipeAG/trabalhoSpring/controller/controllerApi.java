package com.felipeAG.trabalhoSpring.controller;

import com.felipeAG.trabalhoSpring.domain.User;
import com.felipeAG.trabalhoSpring.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
/*
* Combina @Controller e @ResponseBody pois pode retrornar uma página html também
* */
// STATELESS -> (API REST) a cada requisição é recebido todas as informações necessitadas para fazer a funcionalidade do cliente
// STATEFULL -> mantém o estado de cada cliente no servidor (não necessitar ficar enviando dados novamente)
@RequestMapping("/hello")
public class controllerApi {

    @Autowired // --> atributo enjetado
    private HelloService helloService;

    /*public controllerApi (HelloService helloService){
        this.helloService = helloService;
    }*/

    @GetMapping //@GetMapping("get") --> /hello/get (mais um patch)
    public String helloWorld(){
        return helloService.hello("Felipe");
    }

    @PostMapping("/{id}")
    public String helloWorldPost (@PathVariable("id") String id, @RequestParam(value = "id2", defaultValue = "000") String id2, @RequestBody User body){
        return "Hello World! "+body.getNome()+" id = "+id;
    }
}
