package com.example.usuarios.Controller;

import com.example.usuarios.Service.UsuarioService;
import com.example.usuarios.model.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @PostMapping
    public Usuario criarUsuario(@RequestBody Usuario usuario){
        return service.salvar(usuario);
    }

    @GetMapping
    public List<Usuario> listarUsuario() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Usuario buscarUsuarioPorId(@PathVariable Long id ) {
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> atualizarPorId(@PathVariable Long id, @RequestBody Usuario usuarioNovo) {
        service.atualizar(id, usuarioNovo);
        return ResponseEntity.ok("Usuário atualizado com sucesso!");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarPorId(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.ok("Usuário deletado com sucesso!");
    }
}
