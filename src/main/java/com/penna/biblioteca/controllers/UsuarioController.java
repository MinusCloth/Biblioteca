package com.penna.biblioteca.controllers;

import com.penna.biblioteca.dtos.UsuarioDto;
import com.penna.biblioteca.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<UsuarioDto> findAll(){
        List<UsuarioDto> usuarios = usuarioService.findAll();
        return usuarios;
    }
}
