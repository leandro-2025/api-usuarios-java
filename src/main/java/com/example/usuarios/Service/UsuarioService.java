package com.example.usuarios.Service;

import com.example.usuarios.model.Usuario;
import org.springframework.stereotype.Service;
import com.example.usuarios.Repository.UsuarioReporitory;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    private final UsuarioReporitory reporitory;

    public UsuarioService(UsuarioReporitory reporitory) {
        this.reporitory = reporitory;
    }

    public Usuario salvar(Usuario usuario){

        Usuario usuarioExistente = reporitory.findByEmail(usuario.getEmail());
        if (usuarioExistente != null) {
            throw new RuntimeException("Esse email já existe!");
        }

        return reporitory.save(usuario);
    }

    public List<Usuario> listar() {
         return reporitory.findAll();
    }

    public Usuario buscarPorId(Long id) {
        return reporitory.findById(id)
                .orElseThrow(()-> new RuntimeException("ID de usuario não cadastrado!"));
    }

    public Usuario atualizar(Long id, Usuario usuarioNovo){
        Usuario usuarioExistente = reporitory.findById(id)
                .orElseThrow(()-> new RuntimeException("Usuario com este ID não encontrado!"));

        usuarioExistente.setNome(usuarioNovo.getNome());
        usuarioExistente.setEmail(usuarioNovo.getEmail());
        usuarioExistente.setSenha(usuarioNovo.getSenha());

        return reporitory.save(usuarioExistente);
    }

    public void deletar(Long id) {
        Usuario usuario = reporitory.findById(id)
                .orElseThrow(()-> new RuntimeException("ID deste usuário não cadastrado ou não existente!"));

        reporitory.deleteById(id);
    }
}
