package com.springboot.pos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableScheduling
public class PosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PosApplication.class, args);
	}
//	@Scheduled(cron = "*/10 * * * * *")
//	private static void helloworld() {
//		System.out.println("Hello World!");
//	}


	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
