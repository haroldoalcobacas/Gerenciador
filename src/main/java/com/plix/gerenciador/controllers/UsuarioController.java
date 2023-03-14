package com.plix.gerenciador.controllers;

import com.plix.gerenciador.models.Usuario;
import com.plix.gerenciador.services.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;


    @GetMapping("/novo")
    public ModelAndView novoUsuario() {
        ModelAndView mv = new ModelAndView("usuario/cadastro");
        mv.addObject("usuario", new Usuario());
        return mv;
    }

    @PostMapping("")
    public ModelAndView salvarUsuario(@Valid Usuario usuario, BindingResult bindingResult) {

        ModelAndView mv = new ModelAndView("usuario/cadastro");

        if (bindingResult.hasErrors()) {
            mv.addObject("usuario", usuario);
            return mv;
        }

        Usuario usuarioSalvo = usuarioService.salvarUsuario(usuario);

        if (usuario.getId() == null) {
            mv.addObject("usuario", new Usuario());
        } else {
            mv.addObject("usuario", usuarioSalvo);
        }

        mv.addObject("mensagem", "Usuário Cadastrado com Sucesso!");
        return mv;
    }
}
