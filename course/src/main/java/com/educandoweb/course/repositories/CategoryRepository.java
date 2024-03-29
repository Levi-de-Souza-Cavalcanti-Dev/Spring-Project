package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Category;


/*
 * Instanciar o obj repository para fazer operações com o usuário 
 */

//Spring JPA ja tem uma implementação padrão da interface

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
