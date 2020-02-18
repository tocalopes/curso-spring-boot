package com.lopes.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lopes.curso.entities.Product;

//A implementação da interface é feita por padrão pelo spring 
public interface ProductRepository extends JpaRepository<Product, Long>{
	
	
}
