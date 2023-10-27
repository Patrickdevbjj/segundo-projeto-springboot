package br.com.patrick.segundoprojetospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "br.com.patrick")
public class SegundoProjetoSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SegundoProjetoSpringbootApplication.class, args);
	}

}
