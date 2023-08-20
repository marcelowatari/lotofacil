package tech.ada.java.lotofacil.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import tech.ada.java.lotofacil.dto.NovoUsuarioDTO;
import tech.ada.java.lotofacil.dto.UsuarioDTO;
import tech.ada.java.lotofacil.model.Usuario;
import tech.ada.java.lotofacil.repository.UsuarioRepository;

@Component
public class UsuarioService {
	
	private final UsuarioRepository usuarioRepository;

	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}
	
	public List<UsuarioDTO> findAll() {
        return usuarioRepository.findAll()
                .stream()
                .map( usuario -> parseToUsuarioDTO(usuario) )
                .collect(Collectors.toList());
    }
	
	public UsuarioDTO save( NovoUsuarioDTO novoUuarioDTO ) {
		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encode = passwordEncoder.encode(  novoUuarioDTO.getPassword() );
		novoUuarioDTO.setPassword(encode);
		Usuario usuario = parseToUsuario( novoUuarioDTO );
		Usuario usuarioSalvo = usuarioRepository.save( usuario );
		
		return this.parseToUsuarioDTO(usuarioSalvo);
	}
	
	private Usuario parseToUsuario(NovoUsuarioDTO novoUsuarioDTO) {
        Usuario usuario = new Usuario();
        usuario.setEmail( novoUsuarioDTO.getEmail() );
        usuario.setIdade( novoUsuarioDTO.getIdade() );
        usuario.setNome( novoUsuarioDTO.getNome() );
        usuario.setPassword( novoUsuarioDTO.getPassword() );
        return usuario;
    }
	
	private UsuarioDTO parseToUsuarioDTO(Usuario usuario) {
		UsuarioDTO usuarioDTO = new UsuarioDTO();
        usuarioDTO.setEmail( usuario.getEmail() );
        usuarioDTO.setIdade( usuario.getIdade() );
        usuarioDTO.setNome( usuario.getNome() );
        usuarioDTO.setId( usuario.getId() );
        return usuarioDTO;
    }
	
}
