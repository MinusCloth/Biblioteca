package com.penna.biblioteca.dtos;

import com.penna.biblioteca.entities.LivroEntity;
import org.springframework.beans.BeanUtils;

import java.util.Objects;

public class LivroDto {

    private Long id;
    private String titulo;
    private String autor;
    private String genero;
    private int disponiveis;

    public LivroDto(LivroEntity entity){
        BeanUtils.copyProperties(entity, this);
    }

    public LivroDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDisponiveis() {
        return disponiveis;
    }

    public void setDisponiveis(int disponiveis) {
        this.disponiveis = disponiveis;
    }


}
