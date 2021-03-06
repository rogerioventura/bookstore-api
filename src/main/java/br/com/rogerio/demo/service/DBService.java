package br.com.rogerio.demo.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rogerio.demo.domain.Categoria;
import br.com.rogerio.demo.domain.Livro;
import br.com.rogerio.demo.repositories.CategoriaRepository;
import br.com.rogerio.demo.repositories.LivroRepository;

@Service
public class DBService {
	
    @Autowired
    private CategoriaRepository categoriaRepository;
    
    @Autowired
    private LivroRepository livroRepository; 

	public void instanciaBaseDeDados() {
		
		Categoria cat1 = new Categoria(null,"Informática" , "Livro de TI");
		Categoria cat2 = new Categoria(null,"Ficção Científica" , "Livro de Ficção Científica");
		Categoria cat3 = new Categoria(null,"Biograficas" , "Livro de Ficção Científica");
		
		Livro l1 = new Livro(null, "Clean Code", "Robert Martin", "Loren ipsum", cat1);
		Livro l2 = new Livro(null, "Engenharia de Software", "Lois V. Gerstner", "Loren ipsum", cat1);
		Livro l3 = new Livro(null, "The Time Machine", "H.G. Welss", "Loren ipsum", cat2);
		Livro l4 = new Livro(null, "The War of the Worlds", "H.G. Welss", "Loren ipsum", cat2);
		Livro l5 = new Livro(null, "I, Robot", "Issac Asimov", "Loren ipsum", cat2);
		
		cat1.getLivros().addAll(Arrays.asList(l1,l2));
		cat2.getLivros().addAll(Arrays.asList(l3,l4,l5));
		
		this.categoriaRepository.saveAll(Arrays.asList(cat1,cat2, cat3));
		this.livroRepository.saveAll(Arrays.asList(l1,l2,l3,l4,l5));
	}
}
