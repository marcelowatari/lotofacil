package tech.ada.java.lotofacil.dto;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class NovoUsuarioDTO {
	private Long id;
	
    @NotNull(message = "Email nao pode ser nulo")
    @NotBlank(message = "Email nao pode ser em branco")
    @Email
	private String email;
    
    @NotBlank(message = "Password é obrigatorio")
	private String password;
    
    @NotBlank(message = "Nome é obrigatorio")
	private String nome;
	
	@Min(value = 18, message = "Usuario deve ter 18 anos ou mais para jogar.")
	private int idade;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
