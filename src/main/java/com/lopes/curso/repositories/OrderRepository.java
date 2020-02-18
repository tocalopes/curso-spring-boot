package com.lopes.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lopes.curso.entities.Order;

//A implementação da interface é feita por padrão pelo spring 
public interface OrderRepository extends JpaRepository<Order, Long>{
	
	
}
