package com.bridgelabz.demo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class Application {
	
	
	public static void main(String[] args) {
	    SpringApplication springApplication=new SpringApplication(Application.class);
	    System.out.println("Hello to Bridgelabz");
	    springApplication.run(args);

	}
	@Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}


