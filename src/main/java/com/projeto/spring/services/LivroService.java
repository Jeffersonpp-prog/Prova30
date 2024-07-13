package com.projeto.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.spring.entities.Livro;
import com.projeto.spring.repository.LivroRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class LivroService {

    @Autowired
    private LivroRepository livroRepository; // Usar camel case para o nome da variável

    public List<Livro> getAllLivros() {
        return livroRepository.findAll(); // Corrigido para findAll()
    }

    public Livro saveLivro(Livro livro) {
        return livroRepository.save(livro); // Retorna o Livro salvo
    }
}
