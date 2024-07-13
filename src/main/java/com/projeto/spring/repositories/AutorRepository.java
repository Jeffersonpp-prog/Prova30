package com.projeto.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projeto.spring.entities.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long> {
}
