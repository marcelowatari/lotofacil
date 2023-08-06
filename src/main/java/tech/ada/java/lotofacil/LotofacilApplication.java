package tech.ada.java.lotofacil;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tech.ada.java.lotofacil.repository.LotofacilRepository;

@SpringBootApplication
public class LotofacilApplication implements CommandLineRunner {

	private final LotofacilRepository repository;
	
	public LotofacilApplication( LotofacilRepository repository) {
		this.repository = repository;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(LotofacilApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
