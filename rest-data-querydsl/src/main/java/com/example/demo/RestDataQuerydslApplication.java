package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestDataQuerydslApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(RestDataQuerydslApplication.class, args);
	}
	private final PersonRepository personRepo;
	
	RestDataQuerydslApplication(PersonRepository personRepo){
	  this.personRepo = personRepo;
	}
	
	@Override
	public void run(String... args) throws Exception {
	  personRepo.saveAll(Arrays.asList(new Person("Deyne","Dirk"),new Person("Deyne","Kevin"),new Person("Groosman","Nicole")));
	  
	  personRepo.findAll(QPerson.person.lastname.startsWith("Dey")).forEach(System.err::println);;
	}
}
