package br.univille.cademeututor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.cademeututor.modelVO.UserVO;
import br.univille.cademeututor.services.UserService;

@Controller
@RequestMapping("/user")
public class UserWSController {

    @Autowired
    private UserService userService;

    @GetMapping("/create")
    public ModelAndView create() {
        return new ModelAndView("create");
    }

    @GetMapping("/login")
    public ModelAndView login() {
        return new ModelAndView("login");
    }

    @PostMapping(params = "form")
    public ModelAndView save(UserVO user) {
        userService.createUser(user);
        return new ModelAndView("redirect:/index");
    }
}