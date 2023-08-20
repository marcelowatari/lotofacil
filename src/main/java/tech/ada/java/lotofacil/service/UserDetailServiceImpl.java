package tech.ada.java.lotofacil.service;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import tech.ada.java.lotofacil.model.Usuario;
import tech.ada.java.lotofacil.repository.UsuarioRepository;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

	private final UsuarioRepository usuarioRepository;
	
	public UserDetailServiceImpl(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
		
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Usuario> optUsuario = usuarioRepository.findByEmail( username );
		UserDetailsImpl userDetailsImpl = new UserDetailsImpl( 
				optUsuario.orElseThrow( 
						() -> new UsernameNotFoundException("Usuario nao encontrado.")));
		return userDetailsImpl;
	}
	
}
