package tech.ada.java.lotofacil;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tech.ada.java.lotofacil.resultadosanteriores.CarregarResultadosAnteriores;
import tech.ada.java.lotofacil.resultadosanteriores.dto.BeanUmResultadoCSV;
import tech.ada.java.lotofacil.service.ResultadosAnterioresService;

@SpringBootApplication
public class LotofacilApplication implements CommandLineRunner {

	private final ResultadosAnterioresService resultadosAnterioresService;

	private final String filePathResultadosAnteriores = "lotofacil-resultados-anteriores-v2.csv";
	
	public LotofacilApplication( 
			ResultadosAnterioresService resultadosAnterioresService) {
		this.resultadosAnterioresService = resultadosAnterioresService;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(LotofacilApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		List<BeanUmResultadoCSV> listBeanUmResultadoCSV = CarregarResultadosAnteriores.carregar(filePathResultadosAnteriores);
		
		System.out.println("teste");
		
		resultadosAnterioresService.save( listBeanUmResultadoCSV );
	}

}
