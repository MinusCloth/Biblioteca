package com.penna.biblioteca.repositories;

import com.penna.biblioteca.entities.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariosRepository extends JpaRepository<Usuarios,Long> {
}
