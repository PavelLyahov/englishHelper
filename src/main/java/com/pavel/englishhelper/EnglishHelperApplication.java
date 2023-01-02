package com.pavel.englishhelper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RequestMapping(value="hello")
public class EnglishHelperApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnglishHelperApplication.class, args);
	}

}
