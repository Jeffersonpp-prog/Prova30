package com.projeto.spring.repository;


public class LivroRepository {

	@Repository
	public interface LivroRepository extends JpaRepository<Livro,Long>{
		
	}
	
}
