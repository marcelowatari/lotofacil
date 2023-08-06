package tech.ada.java.lotofacil.resultadosanteriores;

import java.io.IOException;
import java.io.Reader;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import tech.ada.java.lotofacil.resultadosanteriores.dto.BeanUmResultadoCSV;
import tech.ada.java.lotofacil.resultadosanteriores.dto.ConcursoResultadoCSV;

public class CarregarResultadosAnteriores {
	
	private static final Logger logger = LoggerFactory.getLogger(CarregarResultadosAnteriores.class);

	public static Map<Integer, ConcursoResultadoCSV> carregar(String filePath) {

		System.out.println("Carregando resultados anteriores da lotofacil...");
		
		Path path;
		try {
			path = Paths.get(ClassLoader.getSystemResource(filePath).toURI());
		} catch (URISyntaxException e) {
			logger.error("Nao foi possivel carregar os dados", e);
			throw new IllegalArgumentException(filePath);
		}

		
		Map<Integer, ConcursoResultadoCSV> mapResultadoJogosAnteriores = null;
		
		try (Reader reader = Files.newBufferedReader(path)) {
			CsvToBean<BeanUmResultadoCSV> cb = new CsvToBeanBuilder<BeanUmResultadoCSV>(reader)
					.withSeparator(';')
					.withType(BeanUmResultadoCSV.class).build();
			
			List<BeanUmResultadoCSV> parse = cb.parse();
			
			System.out.println("Dados carregados com sucesso");
			
//			mapResultadoJogosAnteriores = cb.stream().collect(Collectors.toMap(valor -> valor.getConcurso(),
//					beanUmResultado -> new ConcursoResultadoCSV(beanUmResultado)));

		} catch (IOException e) {
			logger.error("Nao foi possivel carregar os dados", e);
		}
		
		System.out.println("Dados carregados com sucesso");

		return mapResultadoJogosAnteriores;
	}

}
