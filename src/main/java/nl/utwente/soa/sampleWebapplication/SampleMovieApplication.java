package nl.utwente.soa.sampleWebapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SampleMovieApplication {
	public static void main(String[] args) {
		SpringApplication.run(SampleMovieApplication.class, args);
	}
}
