package tech.ada.java.lotofacil.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import tech.ada.java.lotofacil.dto.parser.JogoEscolhidoCheckSorteioAnteriores;
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
	
	public List<JogoEscolhidoCheckSorteioAnteriores> checarSeJogoFoiSorteado( HashSet<Integer> numerosEscolhidosNoMeuJogo ) {
		
		List<JogoEscolhidoCheckSorteioAnteriores> listaDeSorteiosGanhos = new ArrayList<>();
		List<LotofacilResultadosAnterioresDTO> listaResultadosAnteriores = this.findAll();
		for (LotofacilResultadosAnterioresDTO umResultadoAnterior : listaResultadosAnteriores) {
			String numerosSorteados = umResultadoAnterior.getNumerosSorteados();
			Set<Integer> setNumerosSorteados = Stream.of( numerosSorteados.split(";") )
				.mapToInt(Integer::parseInt)
				.boxed().collect(Collectors.toSet());
			
			int qtdeNumerosAcertados = 15;
			for (int umNumeroEscolhido : numerosEscolhidosNoMeuJogo ) {
				
				boolean contains = setNumerosSorteados.contains( umNumeroEscolhido  );
				if( ! contains ) {
					qtdeNumerosAcertados --;
				}
				if( qtdeNumerosAcertados < 11 ) {
					break;
				}
			}
			
			if( qtdeNumerosAcertados > 10 ) {
				JogoEscolhidoCheckSorteioAnteriores jogoEscolhidoCheckSorteioAnteriores = new JogoEscolhidoCheckSorteioAnteriores();
				jogoEscolhidoCheckSorteioAnteriores.setLotofacilResultadosAnterioresDTO(umResultadoAnterior);
				jogoEscolhidoCheckSorteioAnteriores.setPremiado( true );
				jogoEscolhidoCheckSorteioAnteriores.setQtdeNumerosQueTeriaAcertado(qtdeNumerosAcertados );
				listaDeSorteiosGanhos.add(jogoEscolhidoCheckSorteioAnteriores);
			}
		}
		
		return listaDeSorteiosGanhos;
	}
	
//	public void checarJogoAlgumaVezSorteado(Map<Integer, MeuJogoNumerosEscolhidos> meusJogos) {
//
//		for ( MeuJogoNumerosEscolhidos umMeuJogo : meusJogos.values() ) {
//			System.out.println( "Verificando o jogo " + umMeuJogo.getIdJogo() );
//			HashSet<Integer> numerosEscolhidos = umMeuJogo.getNumerosQueEscolhiJogar();
//
//			ArrayList<Integer> arrayNumerosEscolhidosOrdenar = new ArrayList<Integer>( numerosEscolhidos );
//			Collections.sort(arrayNumerosEscolhidosOrdenar);
//			System.out.println( "Numeros escolhidos: " + arrayNumerosEscolhidosOrdenar);
//			
//			boolean jogoSorteado = false;
//			for ( ConcursoResultado umConcurso : mapResultadoJogosAnteriores.values() ) {
//				HashSet<Integer> numerosSorteados = umConcurso.getNumerosSorteados();
//
//				int qtdeNumerosAcertados = 6;
//				for (int umNumeroEscolhido : numerosEscolhidos) {
//					boolean contains = numerosSorteados.contains( umNumeroEscolhido );
//					if( ! contains ) {
//						qtdeNumerosAcertados --;
//					}
//					if( qtdeNumerosAcertados < 4 ) {
//						break;
//					}
//				}
//				
//				if( qtdeNumerosAcertados >  3 ) {
//					jogoSorteado  = true;
//					printPremiado( qtdeNumerosAcertados, umConcurso );
//				}
//			}
//			
//			if( ! jogoSorteado ) {
//				printJogoNuncaSorteado();
//
//			}
//			pularLinha(1);
//
//		}
//	}

	
}
