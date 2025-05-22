package com.cadastro.usuario.repositories;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 

import com.cadastro.usuario.models.Usuario; 

@Repository 
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}