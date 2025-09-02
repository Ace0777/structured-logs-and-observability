package br.com.ace.logssse;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@Slf4j
@SpringBootApplication
@EnableScheduling
public class LogsSseApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogsSseApplication.class, args);
		log.info("testee");
	}

}
