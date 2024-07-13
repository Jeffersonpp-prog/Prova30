package com.projeto.spring.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.projeto.spring.entities.Autor;
import com.projeto.spring.repositories.AutorRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AutorService {

    private final AutorRepository autorRepository = null;

    public List<Autor> getAll() {
        return autorRepository.findAll();
    }

    public Autor saveAutor(Autor autor) {
        return autorRepository.save(autor);
    }

	public List<Autor> getAllAutores() {
		// TODO Auto-generated method stub
		return null;
	}
}

