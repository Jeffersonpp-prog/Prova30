package com.projeto.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.spring.entities.Livro;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class LivroService {

	@Autowired
	private LivroRepository LivroRepository;
	
	public List<Livro> getAllLivros() {
		return LivroRepository.findALL();
		}
	
	public void saveLivro(Livro livro) {
		LivroRepository.save(livro);
	}
	
	}
