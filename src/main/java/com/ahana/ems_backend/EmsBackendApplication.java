package com.ahana.ems_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class EmsBackendApplication {

	public static void main(String[] args) {

		SpringApplication.run(EmsBackendApplication.class, args);
	}

}
