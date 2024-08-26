package stasqq.nothingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(NothingAppConfiguration.class)
public class NothingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(NothingAppApplication.class, args);
	}

}
