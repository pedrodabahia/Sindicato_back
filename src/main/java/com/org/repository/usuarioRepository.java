/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.org.repository;

import com.org.entity.usuario;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

/**
 *
 * @author pedro
 */
public interface usuarioRepository extends JpaRepository<usuario, Long>{
	Optional<usuario>
	findByMatriculaAndCpf(Integer matriz, String Cpf);
}
