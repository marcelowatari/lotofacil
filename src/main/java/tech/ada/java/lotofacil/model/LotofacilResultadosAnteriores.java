package tech.ada.java.lotofacil.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "RESULTADOS_ANTERIORES")
public class LotofacilResultadosAnteriores {

	@Id
	@Column(name="id")
	private Integer id;
	
	@Column(name="dataSorteio")
    private String dataSorteio;
	
	@Column(name="numerosSorteados")
    private String numerosSorteados;
	
	@Column(name="ganhadores15Acertos")
    private String ganhadores15Acertos;
	
	@Column(name="locaisGanhadores15Acertos")
    private String locaisGanhadores15Acertos;
	
	@Column(name="rateio15Acertos")
    private String rateio15Acertos;
	
	@Column(name="ganhadores14Acertos")
    private String ganhadores14Acertos;
	
	@Column(name="rateio14Acertos")
    private String rateio14Acertos;
	
	@Column(name="ganhadores13Acertos")
    private String ganhadores13Acertos;
	
	@Column(name="rateio13Acertos")
    private String rateio13Acertos;
	
	@Column(name="ganhadores12Acertos")
    private String ganhadores12Acertos;
	
	@Column(name="rateio12Acertos")
    private String rateio12Acertos;
	
	@Column(name="ganhadores11Acertos")
    private String ganhadores11Acertos;
	
	@Column(name="rateio11Acertos")
    private String rateio11Acertos;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDataSorteio() {
		return dataSorteio;
	}

	public void setDataSorteio(String dataSorteio) {
		this.dataSorteio = dataSorteio;
	}

	public String getNumerosSorteados() {
		return numerosSorteados;
	}

	public void setNumerosSorteados(String numerosSorteados) {
		this.numerosSorteados = numerosSorteados;
	}

	public String getGanhadores15Acertos() {
		return ganhadores15Acertos;
	}

	public void setGanhadores15Acertos(String ganhadores15Acertos) {
		this.ganhadores15Acertos = ganhadores15Acertos;
	}

	public String getLocaisGanhadores15Acertos() {
		return locaisGanhadores15Acertos;
	}

	public void setLocaisGanhadores15Acertos(String locaisGanhadores15Acertos) {
		this.locaisGanhadores15Acertos = locaisGanhadores15Acertos;
	}

	public String getRateio15Acertos() {
		return rateio15Acertos;
	}

	public void setRateio15Acertos(String rateio15Acertos) {
		this.rateio15Acertos = rateio15Acertos;
	}

	public String getGanhadores14Acertos() {
		return ganhadores14Acertos;
	}

	public void setGanhadores14Acertos(String ganhadores14Acertos) {
		this.ganhadores14Acertos = ganhadores14Acertos;
	}

	public String getRateio14Acertos() {
		return rateio14Acertos;
	}

	public void setRateio14Acertos(String rateio14Acertos) {
		this.rateio14Acertos = rateio14Acertos;
	}

	public String getGanhadores13Acertos() {
		return ganhadores13Acertos;
	}

	public void setGanhadores13Acertos(String ganhadores13Acertos) {
		this.ganhadores13Acertos = ganhadores13Acertos;
	}

	public String getRateio13Acertos() {
		return rateio13Acertos;
	}

	public void setRateio13Acertos(String rateio13Acertos) {
		this.rateio13Acertos = rateio13Acertos;
	}

	public String getGanhadores12Acertos() {
		return ganhadores12Acertos;
	}

	public void setGanhadores12Acertos(String ganhadores12Acertos) {
		this.ganhadores12Acertos = ganhadores12Acertos;
	}

	public String getRateio12Acertos() {
		return rateio12Acertos;
	}

	public void setRateio12Acertos(String rateio12Acertos) {
		this.rateio12Acertos = rateio12Acertos;
	}

	public String getGanhadores11Acertos() {
		return ganhadores11Acertos;
	}

	public void setGanhadores11Acertos(String ganhadores11Acertos) {
		this.ganhadores11Acertos = ganhadores11Acertos;
	}

	public String getRateio11Acertos() {
		return rateio11Acertos;
	}

	public void setRateio11Acertos(String rateio11Acertos) {
		this.rateio11Acertos = rateio11Acertos;
	}
	

}
