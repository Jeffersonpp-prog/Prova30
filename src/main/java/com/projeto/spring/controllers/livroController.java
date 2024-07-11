package com.projeto.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.spring.entities.Autor;
import com.projeto.spring.services.AutorService;
import com.projeto.spring.services.LivroService;

@RestController
@RequestMapping(value="/Livros")
public class livroController<Livro> {
	
	@Autowired
	private LivroService service;
	
	@GetMapping
	public ResponseEntity<Object> getAll(){
		Object lista = null;
		return ResponseEntity.status(HttpStatus.OK).body(lista);
	}
	
	@PostMapping
	public ResponseEntity<String> saveLivro(@RequestBody Livro livro) {
		service.saveLivro(livro);
		return ResponseEntity.status(HttpStatus.CREATED).body("Livro cadastrado");
	}
}
