package tech.ada.java.lotofacil;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tech.ada.java.lotofacil.dto.NovoUsuarioDTO;
import tech.ada.java.lotofacil.resultadosanteriores.CarregarResultadosAnteriores;
import tech.ada.java.lotofacil.resultadosanteriores.dto.BeanUmResultadoCSV;
import tech.ada.java.lotofacil.service.ResultadosAnterioresService;
import tech.ada.java.lotofacil.service.UsuarioService;

@SpringBootApplication
public class LotofacilApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(LotofacilApplication.class);
	
	private final ResultadosAnterioresService resultadosAnterioresService;
	
	private final UsuarioService usuarioService;

	private final String filePathResultadosAnteriores = "lotofacil-resultados-anteriores-v2.csv";
	
	public LotofacilApplication( 
			ResultadosAnterioresService resultadosAnterioresService, UsuarioService usuarioService) {
		this.resultadosAnterioresService = resultadosAnterioresService;
		this.usuarioService = usuarioService;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(LotofacilApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		addUusuarioInicial();
		
		List<BeanUmResultadoCSV> listBeanUmResultadoCSV = CarregarResultadosAnteriores.carregar(filePathResultadosAnteriores);
		
		resultadosAnterioresService.save( listBeanUmResultadoCSV );
		logger.debug("Resultados anteriores da lotofacil foi salvo no banco de dados!!!");
		
	}

	private void addUusuarioInicial() {
		NovoUsuarioDTO novoUsuarioDTO = new NovoUsuarioDTO();
		novoUsuarioDTO.setEmail("marcelo@gmail.com");
		novoUsuarioDTO.setIdade(50);
		novoUsuarioDTO.setNome("Marcelo");
		novoUsuarioDTO.setPassword( "12345" );
		usuarioService.save( novoUsuarioDTO );
	}

}
