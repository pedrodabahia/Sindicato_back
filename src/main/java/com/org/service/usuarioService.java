package com.org.service;

import com.org.entity.usuario;
import com.org.repository.usuarioRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pedro
 */
@Service
public class usuarioService {

    @Autowired
    private usuarioRepository usuarioRepo;

    public List<usuario> findAll() {
        return usuarioRepo.findAll();
    }

    public usuario findById(Long id) {
        Optional<usuario> optionalUsuario = usuarioRepo.findById(id);
        return optionalUsuario.orElse(null);
    }

    public void delete(Long id) {
        usuario user = new usuario();
        user.setId(id);
        usuarioRepo.delete(user);
    }

    public usuario update(Long id, usuario user) {
        usuario userFound = findById(id);
        if (userFound != null) {
            return usuarioRepo.save(user);
        } else {
            return user;
        }
    }

    public usuario save(usuario user) {
        return usuarioRepo.save(user);
    }

    public Optional<usuario> findByMatrizAndCpf(Integer matriz, String cpf) {
        return usuarioRepo.findByMatrizAndCpf(matriz, cpf);
    }
}