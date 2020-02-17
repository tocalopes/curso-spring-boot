package com.lopes.curso.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.lopes.curso.entities.User;
import com.lopes.curso.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	//Autowired indica que existe uma dependecia
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null,"Gabriel Lopes","gabriellopes112009@gmail.com","964408814","5322");
		User u2 = new User(null,"Judite Lopes","judite_oliveira@hotmail.com","963448814","9076");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		
	}
	
	
	
}
