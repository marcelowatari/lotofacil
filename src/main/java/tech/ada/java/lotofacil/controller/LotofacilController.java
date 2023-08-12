package tech.ada.java.lotofacil.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tech.ada.java.lotofacil.dto.parser.ChecarJogoSeFoiSorteadoAlgumaVezReqDTO;
import tech.ada.java.lotofacil.dto.parser.LotofacilResultadosAnterioresDTO;
import tech.ada.java.lotofacil.service.LotofacilService;

@RestController
@RequestMapping("/v1")
public class LotofacilController {
	
	LotofacilService lotofacilService;

	public LotofacilController(LotofacilService lotofacilService) {
		this.lotofacilService = lotofacilService;
	}
	
	@GetMapping
	public ResponseEntity<List<LotofacilResultadosAnterioresDTO>> findAllResultadosAnteriores() {
		return ResponseEntity.ok( lotofacilService.findAll() );
	}
	
	@PostMapping
	public ResponseEntity<List<LotofacilResultadosAnterioresDTO>> checarJogoSeFoiSorteadoAlgumaVez(
			@RequestBody ChecarJogoSeFoiSorteadoAlgumaVezReqDTO checarJogoSeFoiSorteadoAlgumaVezReqDTO) {
		return ResponseEntity.ok( lotofacilService.findAll() );
	}

}
