package br.com.alessanderleite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringSecurityJwtRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJwtRestApiApplication.class, args);
	}

}
