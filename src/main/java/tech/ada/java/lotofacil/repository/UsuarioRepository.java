package tech.ada.java.lotofacil.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.ada.java.lotofacil.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByEmail(String email);

}
