package com.projeto.spring.repository;

import com.projeto.spring.entities.Autor;

public class AutorRepository {

	@Repository
	public interface AutorRepository extends JpaRepository<Autor, Long> {
		
	}

	public void save(Autor autor) {
				
	}

}
