package br.univille.cademeututor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/index")
    @ResponseBody
    public String index() {
        return "Eu não acredito";
    }

    @GetMapping("/contato")
    @ResponseBody
    public String contato() {
        return "gabrielly.martinez@univille.br";
    }
}