package com.phillip.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phillip.app.model.Usuario;


@Repository
public interface UsuarioRepo extends JpaRepository<Usuario, Long> {
	
}

