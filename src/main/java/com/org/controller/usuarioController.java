/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.org.controller;

import com.org.entity.usuario;
import com.org.service.usuarioService;
import io.swagger.v3.oas.annotations.Operation;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;





/**
 *
 * @author pedro
 */
@CrossOrigin(origins = "https://sindicatosystem.netlify.app/admin")
@RestController
@RequestMapping("/usuarios")
public class usuarioController {

    @Autowired
    private usuarioService usuarioServ;
    
    @GetMapping(value = "/listar")
    public List<usuario> list(){
    System.out.println("recuperando alunos -----");
    return usuarioServ.findAll();
    }
    
    @PostMapping
    public void salvar (@RequestBody usuario user){
        System.out.println("Salvando Usuario" + user.getName());
        usuarioServ.save(user);
    }
    
    public ResponseEntity<List<usuario>> findAll(){
        return ResponseEntity.ok(usuarioServ.findAll());
    }

}
