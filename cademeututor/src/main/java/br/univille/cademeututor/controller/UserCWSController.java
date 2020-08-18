package br.univille.cademeututor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/commons/user")
public class UserCWSController {

    @PostMapping("/createOrUpdate")
    @ResponseBody
    public String createOrUpdate(
        @RequestParam(value = "id", required = false) String id,
        @RequestParam(value = "name", required = true) String name,
        @RequestParam(value = "email", required = true) String email,
        @RequestParam(value = "password", required = true) String password,
        @RequestParam(value = "passwordConfirmation", required = true) String passwordConfirmation,
        @RequestParam(value = "federalIdentification", required = true) String federalIdentification,
        @RequestParam(value = "cellphone", required = false) String cellphone
        ) {
        return null;
        //TODO: createUser
    }

    @GetMapping("/contato")
    @ResponseBody
    public String contato() {
        return "gabrielly.martinez@univille.br";
    }
}