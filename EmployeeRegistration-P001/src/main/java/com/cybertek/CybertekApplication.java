package com.cybertek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.Period;

@SpringBootApplication
public class CybertekApplication {

	public static void main(String[] args) {
		SpringApplication.run(CybertekApplication.class, args);

//		String date="1987-11-15";
//		LocalDate ldate=LocalDate.parse(date);
//		Period convert=Period.between(ldate, LocalDate.now());
//		System.out.println("Age: "+convert.getYears());
	}

}
