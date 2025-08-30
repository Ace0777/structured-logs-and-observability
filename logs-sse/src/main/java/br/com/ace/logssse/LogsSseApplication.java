package br.com.ace.logssse;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class LogsSseApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogsSseApplication.class, args);
		log.info("testee");
	}

}
