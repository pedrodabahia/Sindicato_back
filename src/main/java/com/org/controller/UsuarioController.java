package com.org.controller;

import com.org.entity.usuario;
import com.org.service.usuarioService;
import io.swagger.v3.oas.annotations.Operation;
import java.io.IOException;
import java.util.List;
import java.util.Collections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author pedro
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private usuarioService usuarioServ;

    @GetMapping(value = "/consulta")
    public ResponseEntity<?> consultaUsuario(@RequestParam Integer matricula,
                                             @RequestParam String cpf) {
        boolean existe = usuarioServ.findByMatriculaAndCpf(matricula, cpf).isPresent();
        return ResponseEntity.ok(Collections.singletonMap("existe", existe));
    }

    @PostMapping
    public void salvar(@RequestBody usuario user) {
        System.out.println("Salvando Usuario " + user.getName());
        usuarioServ.save(user);
    }

    @GetMapping
    public ResponseEntity<List<usuario>> findAll() {
        return ResponseEntity.ok(usuarioServ.findAll());
    }
}