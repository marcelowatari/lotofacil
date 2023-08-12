package tech.ada.java.lotofacil.dto.parser;

public class JogoEscolhidoCheckSorteioAnteriores {

	LotofacilResultadosAnterioresDTO LotofacilResultadosAnterioresDTO;
	int qtdeNumerosQueTeriaAcertado;
	boolean premiado;
	
	public LotofacilResultadosAnterioresDTO getLotofacilResultadosAnterioresDTO() {
		return LotofacilResultadosAnterioresDTO;
	}
	public void setLotofacilResultadosAnterioresDTO(LotofacilResultadosAnterioresDTO lotofacilResultadosAnterioresDTO) {
		LotofacilResultadosAnterioresDTO = lotofacilResultadosAnterioresDTO;
	}
	public int getQtdeNumerosQueTeriaAcertado() {
		return qtdeNumerosQueTeriaAcertado;
	}
	public void setQtdeNumerosQueTeriaAcertado(int qtdeNumerosQueTeriaAcertado) {
		this.qtdeNumerosQueTeriaAcertado = qtdeNumerosQueTeriaAcertado;
	}
	public boolean isPremiado() {
		return premiado;
	}
	public void setPremiado(boolean premiado) {
		this.premiado = premiado;
	}
	
	
}
