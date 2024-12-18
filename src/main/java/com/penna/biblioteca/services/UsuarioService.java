package com.penna.biblioteca.services;

import com.penna.biblioteca.dtos.UsuarioDto;
import com.penna.biblioteca.entities.UsuarioEntity;
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
        List<UsuarioEntity> result=usuariosRepository.findAll();
        //     obj             map obj que deseja::new para uma lista
        return result.stream().map(UsuarioDto::new).toList();//converte a entity em dto

    }

    public UsuarioDto findById(@PathVariable Long userId){
        UsuarioEntity usuario = usuariosRepository.findById(userId).get();
        return new UsuarioDto(usuario);
    }

    public UsuarioDto insert(UsuarioDto usuario) {//Receber Dto
        UsuarioEntity usuarioEntity = new UsuarioEntity(usuario);//Converter Dto para entity
        UsuarioEntity savedUser=usuariosRepository.save(usuarioEntity);//salvar entity no db
        return new UsuarioDto(savedUser);//converter novamente para dto
    }

    public UsuarioDto update(UsuarioDto usuarioDto){//Receber Dto
        UsuarioEntity usuario = new UsuarioEntity(usuarioDto);//Converter Dto para entity
        UsuarioEntity savedUser = usuariosRepository.save(usuario);//salvar entity no db
        return new UsuarioDto(savedUser);//converter novamente para dto

    }

    public void delete(@PathVariable Long id){
        usuariosRepository.deleteById(id);
    }





}
