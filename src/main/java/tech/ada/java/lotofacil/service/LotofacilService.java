package tech.ada.java.lotofacil.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import tech.ada.java.lotofacil.dto.parser.LotofacilResultadosAnterioresDTO;
import tech.ada.java.lotofacil.repository.ResultadosAnterioresRepository;

@Service
public class LotofacilService {
	
	private final ResultadosAnterioresRepository repository;

	public LotofacilService(ResultadosAnterioresRepository repository) {
		this.repository = repository;
	}
	
	public List<LotofacilResultadosAnterioresDTO> findAll() {
		return repository.findAll()
				.stream()
				.map( umResultado -> new LotofacilResultadosAnterioresDTO( umResultado ))
				.collect(Collectors.toList());
	}

	
}
