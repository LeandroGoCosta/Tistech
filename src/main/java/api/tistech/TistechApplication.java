package api.tistech;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class TistechApplication {
	
	private static final Logger log = LoggerFactory.getLogger(TistechApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TistechApplication.class, args);
	}
	
	
	@Bean
	public CommandLineRunner run() throws Exception {
		return args -> {
			
			   log.info("\n----------------------------------------------------------\n\t" +
					"Application '{}' is running! Access URLs:\n\t" +
					"Local: \t\thttp://127.0.0.1:{}\n\t" +
					"External: \thttp://{}:{}\n----------------------------------------------------------" );
						
		};

	};

}
