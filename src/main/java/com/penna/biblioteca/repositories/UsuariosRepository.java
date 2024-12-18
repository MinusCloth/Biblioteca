package com.penna.biblioteca.repositories;

import com.penna.biblioteca.entities.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariosRepository extends JpaRepository<UsuarioEntity,Long> {

}
