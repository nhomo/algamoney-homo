package com.nhomo.algamoney;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.nhomo.algamoney.config.property.AlgamoneyApiProperty;

@SpringBootApplication
@EnableConfigurationProperties(AlgamoneyApiProperty.class)
public class AlgamoneyHomoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlgamoneyHomoApplication.class, args);
	}

}
