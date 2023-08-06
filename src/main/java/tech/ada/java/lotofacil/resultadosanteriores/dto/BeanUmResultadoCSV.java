package tech.ada.java.lotofacil.resultadosanteriores.dto;
import java.time.LocalDate;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

public class BeanUmResultadoCSV {
	
	@CsvBindByName(column = "Concurso")
    private int concurso;

    public int getConcurso() {
		return concurso;
	}

	public void setConcurso(int concurso) {
		this.concurso = concurso;
	}

	@CsvBindByName(column = "Data Sorteio")
    @CsvDate("dd/MM/yyyy")
    private LocalDate dataSorteio;
    
    @CsvBindByName(column = "Resultado")
    private String resultado;
    
    @CsvBindByName(column = "Ganhadores 15 acertos")
    private int ganhadores15Acertos;
    
    @CsvBindByName(column = "Cidade / UF")
    private String localidade;
    
    @CsvBindByName(column="Rateio 15 acertos")
    private String rateio15Acertos;
	
    @CsvBindByName(column="Ganhadores 14 acertos")
    private int ganhadores14Acertos;
	
    @CsvBindByName(column="Rateio 14 acertos")
    private String rateio14Acertos;
	
    @CsvBindByName(column="Ganhadores 13 acertos")
    private int ganhadores13Acertos;
	
    @CsvBindByName(column="Rateio 13 acertos")
    private String rateio13Acertos;
	
    @CsvBindByName(column="Ganhadores 12 acertos")
    private int ganhadores12Acertos;
	
    @CsvBindByName(column="Rateio 12 acertos")
    private String rateio12Acertos;
	
    @CsvBindByName(column="Ganhadores 11 acertos")
    private int ganhadores11Acertos;
	
    @CsvBindByName(column="Rateio 11 acertos")
    private String rateio11Acertos;

	public LocalDate getDataSorteio() {
		return dataSorteio;
	}

	public void setDataSorteio(LocalDate dataSorteio) {
		this.dataSorteio = dataSorteio;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public int getGanhadores15Acertos() {
		return ganhadores15Acertos;
	}

	public void setGanhadores15Acertos(int ganhadores15Acertos) {
		this.ganhadores15Acertos = ganhadores15Acertos;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
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
