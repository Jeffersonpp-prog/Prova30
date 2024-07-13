package com.projeto.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.projeto.spring.entities.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {
    }

