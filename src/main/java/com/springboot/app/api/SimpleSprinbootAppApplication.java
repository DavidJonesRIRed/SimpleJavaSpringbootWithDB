package com.springboot.app.api;

import com.springboot.app.api.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class SimpleSprinbootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleSprinbootAppApplication.class, args);
	}

	@GetMapping
	public List<Student> hello(){
		return List.of(
				new Student(
						1l,
						"Marian",
						"mariam.jamal@gmail.com",
						LocalDate.of(2000, Month.JANUARY,5),
						21
				)
		);
	}
}
