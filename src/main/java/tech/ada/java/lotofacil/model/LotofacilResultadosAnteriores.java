package tech.ada.java.lotofacil.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "LOTOFACILRESULTADOSANTERIORES")
public class LotofacilResultadosAnteriores {

	@Id
	@Column(name="id")
	private Integer id;
	
	@Column(name="resultado")
    private String resultado;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	
	

}
