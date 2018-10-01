package com.example.springsocial;

import com.example.springsocial.config.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@SpringBootApplication
@EntityScan(basePackageClasses = {
		SpringSocialDemoApplication.class,
		Jsr310JpaConverters.class
})
@EnableConfigurationProperties(AppProperties.class)
public class SpringSocialDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSocialDemoApplication.class, args);
	}
}
