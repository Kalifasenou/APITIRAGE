package com.APITirage.APITIRAGE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
//@EntityScan("com.APITirage.APITIRAGE.Repositories.Tirage")
public class ApitirageApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApitirageApplication.class, args);
	}

}
