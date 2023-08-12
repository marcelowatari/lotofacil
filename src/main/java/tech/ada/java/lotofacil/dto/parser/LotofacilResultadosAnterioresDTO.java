package tech.ada.java.lotofacil.dto.parser;

import java.time.LocalDate;

import tech.ada.java.lotofacil.model.LotofacilResultadosAnteriores;

public class LotofacilResultadosAnterioresDTO {
	private Integer id;
    private LocalDate dataSorteio;
    private String numerosSorteados;
    private int ganhadores15Acertos;
    private String locaisGanhadores15Acertos;
    private String rateio15Acertos;
    private int ganhadores14Acertos;
    private String rateio14Acertos;
    private int ganhadores13Acertos;
    private String rateio13Acertos;
    private int ganhadores12Acertos;
    private String rateio12Acertos;
    private int ganhadores11Acertos;
    private String rateio11Acertos;
    
    
    
	public LotofacilResultadosAnterioresDTO( LotofacilResultadosAnteriores lotofacilResultadosAnteriores) {
		this.id = lotofacilResultadosAnteriores.getId();
		this.dataSorteio = lotofacilResultadosAnteriores.getDataSorteio();
		this.numerosSorteados = lotofacilResultadosAnteriores.getNumerosSorteados();
		this.ganhadores15Acertos = lotofacilResultadosAnteriores.getGanhadores15Acertos();
		this.locaisGanhadores15Acertos = lotofacilResultadosAnteriores.getLocaisGanhadores15Acertos();
		this.rateio15Acertos = lotofacilResultadosAnteriores.getRateio15Acertos();
		this.ganhadores14Acertos = lotofacilResultadosAnteriores.getGanhadores14Acertos();
		this.rateio14Acertos = lotofacilResultadosAnteriores.getRateio14Acertos();
		this.ganhadores13Acertos = lotofacilResultadosAnteriores.getGanhadores13Acertos();
		this.rateio13Acertos = lotofacilResultadosAnteriores.getRateio13Acertos();
		this.ganhadores12Acertos = lotofacilResultadosAnteriores.getGanhadores12Acertos();
		this.rateio12Acertos = lotofacilResultadosAnteriores.getRateio12Acertos();
		this.ganhadores11Acertos = lotofacilResultadosAnteriores.getGanhadores11Acertos();
		this.rateio11Acertos = lotofacilResultadosAnteriores.getRateio11Acertos();
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDate getDataSorteio() {
		return dataSorteio;
	}
	public void setDataSorteio(LocalDate dataSorteio) {
		this.dataSorteio = dataSorteio;
	}
	public String getNumerosSorteados() {
		return numerosSorteados;
	}
	public void setNumerosSorteados(String numerosSorteados) {
		this.numerosSorteados = numerosSorteados;
	}
	public int getGanhadores15Acertos() {
		return ganhadores15Acertos;
	}
	public void setGanhadores15Acertos(int ganhadores15Acertos) {
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
	public int getGanhadores14Acertos() {
		return ganhadores14Acertos;
	}
	public void setGanhadores14Acertos(int ganhadores14Acertos) {
		this.ganhadores14Acertos = ganhadores14Acertos;
	}
	public String getRateio14Acertos() {
		return rateio14Acertos;
	}
	public void setRateio14Acertos(String rateio14Acertos) {
		this.rateio14Acertos = rateio14Acertos;
	}
	public int getGanhadores13Acertos() {
		return ganhadores13Acertos;
	}
	public void setGanhadores13Acertos(int ganhadores13Acertos) {
		this.ganhadores13Acertos = ganhadores13Acertos;
	}
	public String getRateio13Acertos() {
		return rateio13Acertos;
	}
	public void setRateio13Acertos(String rateio13Acertos) {
		this.rateio13Acertos = rateio13Acertos;
	}
	public int getGanhadores12Acertos() {
		return ganhadores12Acertos;
	}
	public void setGanhadores12Acertos(int ganhadores12Acertos) {
		this.ganhadores12Acertos = ganhadores12Acertos;
	}
	public String getRateio12Acertos() {
		return rateio12Acertos;
	}
	public void setRateio12Acertos(String rateio12Acertos) {
		this.rateio12Acertos = rateio12Acertos;
	}
	public int getGanhadores11Acertos() {
		return ganhadores11Acertos;
	}
	public void setGanhadores11Acertos(int ganhadores11Acertos) {
		this.ganhadores11Acertos = ganhadores11Acertos;
	}
	public String getRateio11Acertos() {
		return rateio11Acertos;
	}
	public void setRateio11Acertos(String rateio11Acertos) {
		this.rateio11Acertos = rateio11Acertos;
	}
    
    
}
