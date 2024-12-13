package com.penna.biblioteca.controllers;

import com.penna.biblioteca.dtos.UsuarioDto;
import com.penna.biblioteca.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping(value="/usuario")
    public List<UsuarioDto> findAll(){
        List<UsuarioDto> usuarios = usuarioService.findAll();
        return usuarios;
    }

    @PostMapping(value="/usuario")
    public ResponseEntity<UsuarioDto> insert(@RequestBody UsuarioDto usuarioDto) {
        UsuarioDto novoUsuario = usuarioService.insert(usuarioDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoUsuario);
    }

    @PutMapping(value="/usuario")
    public ResponseEntity<UsuarioDto> uptade(@RequestBody UsuarioDto usuarioDto) {
        UsuarioDto novoUsuario= usuarioService.update(usuarioDto);
        return ResponseEntity.status(HttpStatus.OK).body(novoUsuario);

    }
}
