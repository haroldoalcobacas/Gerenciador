package com.plix.gerenciador.services;

import com.plix.gerenciador.models.Usuario;
import com.plix.gerenciador.repositories.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    private UsuarioRepository usuarioRepository;
    public Usuario salvarUsuario(Usuario usuario) {

        return usuarioRepository.save(usuario);
    }

    public List<Usuario> listarUsuario() {
        return usuarioRepository.findAll();
    }

    public Usuario obterUsuario (long id) throws Exception {
        Optional<Usuario> usuario = usuarioRepository.findById(id);

        if(usuario.isEmpty()) {
            throw new Exception("Usuario não encontrado!");
        }
        return usuario.get();
    }

    public void excluirUsuario (long id) {
        usuarioRepository.deleteById(id);
    }
}
