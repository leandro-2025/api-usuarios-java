package com.example.usuarios.Repository;

import com.example.usuarios.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioReporitory extends JpaRepository<Usuario, Long> {

    Usuario findByEmail(String email);
}
