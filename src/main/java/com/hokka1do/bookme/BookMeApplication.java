package com.hokka1do.bookme;

import com.hokka1do.bookme.professionals.Professional;
import com.hokka1do.bookme.repository.ProfessionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class BookMeApplication {

	@Autowired
	private ProfessionalRepository professionalRepository;

	public static void main(String[] args) {
		SpringApplication.run(BookMeApplication.class, args);
	}
	@PostConstruct
	private void initDb(){
		Professional professional = new Professional();
		professional.setFirstName("Illia");
		professional.setLastName("Kuznetsov");
		professionalRepository.save(professional);
	}
}

