package br.com.rogerio.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.rogerio.demo.repositories.CategoriaRepository;
import br.com.rogerio.demo.repositories.LivroRepository;

@SpringBootApplication
public class SpringAngularApplication {

    @Autowired
    private CategoriaRepository categoriaRepository;
    
    @Autowired
    private LivroRepository livroRepository;
    
	public static void main(String[] args) {
		SpringApplication.run(SpringAngularApplication.class, args);
	}


}
