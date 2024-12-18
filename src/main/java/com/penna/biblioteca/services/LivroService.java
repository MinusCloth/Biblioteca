package com.penna.biblioteca.services;

import com.penna.biblioteca.dtos.LivroDto;
import com.penna.biblioteca.entities.LivroEntity;
import com.penna.biblioteca.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    LivroRepository repository;

    public List<LivroDto> findAll(){//retornar dto
        List<LivroEntity>result = repository.findAll(); //busca os livros no db e pega em entity
        //     obj             map obj que deseja::new para uma lista
        return result.stream().map(LivroDto::new).toList();//converte a entity em dto
    }

    public LivroDto findById(@PathVariable Long id){
        LivroEntity livro = repository.findById(id).get();
        return new LivroDto(livro);
    }

    public LivroDto insert(LivroDto dto){
        LivroEntity livro = new LivroEntity(dto);
        LivroEntity savedBook = repository.save(livro);
        return new LivroDto(savedBook);
    }

    public void delete(@PathVariable Long id){
        repository.deleteById(id);
    }
}
