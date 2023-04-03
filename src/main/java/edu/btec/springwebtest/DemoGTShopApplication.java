package edu.btec.springwebtest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import edu.btec.springwebtest.config.StorageProperties;
import edu.btec.springwebtest.service.StorageService;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class DemoGTShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoGTShopApplication.class, args);
	}
	@Bean
	CommandLineRunner init(StorageService storageService) {
		return (args -> {
			storageService.init();
		});
	}
}
