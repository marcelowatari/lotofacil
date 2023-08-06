package tech.ada.java.lotofacil;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tech.ada.java.lotofacil.resultadosanteriores.CarregarResultadosAnteriores;
import tech.ada.java.lotofacil.resultadosanteriores.dto.ConcursoResultadoCSV;
import tech.ada.java.lotofacil.service.ResultadosAnterioresService;

@SpringBootApplication
public class LotofacilApplication implements CommandLineRunner {

	private final ResultadosAnterioresService resultadosAnterioresService;

	private final String filePathResultadosAnteriores = "lotofacil-resultados-anteriores.csv";
	
	@Autowired
	public LotofacilApplication( 
			//LotofacilRepository repository,
			ResultadosAnterioresService resultadosAnterioresService) {
		this.resultadosAnterioresService = resultadosAnterioresService;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(LotofacilApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Map<Integer, ConcursoResultadoCSV> mapResultadoConcursosAnteriores = CarregarResultadosAnteriores.carregar(filePathResultadosAnteriores);
		
		System.out.println("teste");
		
		//resultadosAnterioresService.save( mapResultadoConcursosAnteriores );
	}

}
