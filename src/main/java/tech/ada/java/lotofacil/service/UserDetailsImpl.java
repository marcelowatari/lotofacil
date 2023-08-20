package tech.ada.java.lotofacil.service;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import tech.ada.java.lotofacil.model.Usuario;

public class UserDetailsImpl implements UserDetails {

	private static final String USER = "USER";
	private String email;
	private String password;
	
	public UserDetailsImpl( Usuario usuario ) {
		this.email = usuario.getEmail();
		this.password = usuario.getPassword();
		
	}
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return Collections.singletonList( new SimpleGrantedAuthority( USER ) );
	}

	@Override
	public String getPassword() {
		return this.password;
	}

	@Override
	public String getUsername() {
		return this.email;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
