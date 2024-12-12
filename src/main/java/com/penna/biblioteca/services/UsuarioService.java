package com.penna.biblioteca.services;

import com.penna.biblioteca.dtos.UsuarioDto;
import com.penna.biblioteca.entities.Usuarios;
import com.penna.biblioteca.repositories.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuariosRepository usuariosRepository;


    public List<UsuarioDto>findAll(){
        List<Usuarios> result=usuariosRepository.findAll();
        return result.stream().map(UsuarioDto::new).toList();

    }

    public UsuarioDto findById(@PathVariable Long userId){
        Usuarios usuario = usuariosRepository.findById(userId).get();
        return new UsuarioDto(usuario);
    }

    
}
