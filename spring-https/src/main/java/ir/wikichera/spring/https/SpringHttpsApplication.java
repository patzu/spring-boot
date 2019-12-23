package ir.wikichera.spring.https;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringHttpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHttpsApplication.class, args);
		System.out.println("Let's enjoy spring-https !!!");
	}

}
