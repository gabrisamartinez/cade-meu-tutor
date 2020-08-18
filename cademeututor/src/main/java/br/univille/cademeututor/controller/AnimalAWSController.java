package br.univille.cademeututor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/authentication/animal")
public class AnimalAWSController {

    @PostMapping("/createOrUpdate")
    @ResponseBody
    public String index(
        @RequestParam(value = "id", required = false) String id,
        @RequestParam(value = "name", required = true) String name,
        @RequestParam(value = "age", required = true) String age ,
        @RequestParam(value = "color", required = true) String color,
        @RequestParam(value = "hurt", required = true) Boolean isHurt,
        @RequestParam(value = "identification", required = true) Boolean isIdentification ,
        @RequestParam(value = "animalKind", required = false) Integer animalKind
        ) {
        return null;
        //TODO: crete Animal
    }

    @GetMapping("/contato")
    @ResponseBody
    public String contato() {
        return "gabrielly.martinez@univille.br";
    }
}