package br.com.rogerio.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.rogerio.demo.service.DBService;

@Configuration
@Profile("dev")
public class TestConfig {
	
	@Autowired
	private DBService dbService;
	
	@Bean
	public void instanciaBaseDados() {
		this.dbService.instanciaBaseDeDados();
	}

}
