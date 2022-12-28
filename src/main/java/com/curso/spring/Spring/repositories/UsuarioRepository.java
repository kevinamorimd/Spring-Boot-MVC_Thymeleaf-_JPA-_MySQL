package com.curso.spring.Spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.spring.Spring.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long >{

}
