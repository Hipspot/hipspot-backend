package com.hipspot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class HipspotApplication {

	public static void main(String[] args) {
		SpringApplication.run(HipspotApplication.class, args);
	}
}