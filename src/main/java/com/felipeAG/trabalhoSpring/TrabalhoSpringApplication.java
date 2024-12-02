package com.felipeAG.trabalhoSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*O @ acima contem os abaixos
@Configuration
@EnableAutoConfiguration
@ComponentScan*/

//@Profile("dev") // --> ambiente de teste (spring.profiles.active = dev)
public class TrabalhoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrabalhoSpringApplication.class, args);
	}

}