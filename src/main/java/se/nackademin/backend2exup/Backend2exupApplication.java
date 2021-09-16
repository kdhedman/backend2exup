package se.nackademin.backend2exup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class Backend2exupApplication {

	public static void main(String[] args) {
		SpringApplication.run(Backend2exupApplication.class, args);
	}

}
