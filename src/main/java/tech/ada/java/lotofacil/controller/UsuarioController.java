package tech.ada.java.lotofacil.controller;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import jakarta.validation.Valid;
import tech.ada.java.lotofacil.dto.NovoUsuarioDTO;
import tech.ada.java.lotofacil.dto.UsuarioDTO;
import tech.ada.java.lotofacil.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	private final UsuarioService usuarioService;
	
	public UsuarioController( UsuarioService usuarioService ) {
		this.usuarioService = usuarioService;
	}
	
	 @GetMapping
    public ResponseEntity<List<UsuarioDTO>> findAll() {
        return ResponseEntity.ok(usuarioService.findAll());
    }

	@PostMapping
	public ResponseEntity<UsuarioDTO> salvar( @RequestBody @Valid NovoUsuarioDTO novoUsuarioDTO ) {
		UsuarioDTO usuarioDTO = usuarioService.save( novoUsuarioDTO );
		
		URI uri = ServletUriComponentsBuilder
					.fromCurrentRequest()
					.path("{/id}")
					.buildAndExpand( usuarioDTO.getId() )
					.toUri();
		
		return ResponseEntity.created(uri).body( usuarioDTO );
	}

}
