package com.penna.biblioteca.controllers;

import com.penna.biblioteca.dtos.LivroDto;
import com.penna.biblioteca.services.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LivroController {

    @Autowired
    private LivroService service;

    @GetMapping(value = "livro")
    public List<LivroDto> findAll(){
        List<LivroDto> livros = service.findAll();
        return livros;
    }

    @PostMapping("livro")
    public ResponseEntity<LivroDto> insert(@RequestBody LivroDto livro){
        LivroDto dto = service.insert(livro);
        return ResponseEntity.status(HttpStatus.CREATED).body(dto);
    }




}
