package com.example.oauth2demo;

import com.example.oauth2demo.config.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@SpringBootApplication
@EntityScan(basePackageClasses = {
		Oauth2DemoApplication.class,
		Jsr310JpaConverters.class
})
@EnableConfigurationProperties(AppProperties.class)
public class Oauth2DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Oauth2DemoApplication.class, args);
	}
}
