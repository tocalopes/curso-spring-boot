package com.lopes.curso.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.lopes.curso.entities.Order;
import com.lopes.curso.entities.User;
import com.lopes.curso.repositories.OrderRepository;
import com.lopes.curso.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	//Autowired indica que existe uma dependecia
	@Autowired
	private UserRepository userRepository;

		
	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null,"Gabriel Lopes","gabriellopes112009@gmail.com","964408814","5322");
		User u2 = new User(null,"Judite Lopes","judite_oliveira@hotmail.com","963448814","9076");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1); 
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
	}
	
	
	
}
