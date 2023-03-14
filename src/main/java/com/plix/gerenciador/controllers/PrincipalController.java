package com.plix.gerenciador.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PrincipalController {

    @GetMapping("/index")
    public ModelAndView index() {

        ModelAndView mv = new ModelAndView("index");

        return mv;
    }


}
