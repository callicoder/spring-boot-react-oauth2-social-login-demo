package com.example.springsocial;

import com.example.springsocial.config.AppProperties;
import com.example.springsocial.model.Address;
import com.example.springsocial.model.Category;
import com.example.springsocial.model.User;
import com.example.springsocial.repository.AddressRepository;
import com.example.springsocial.repository.CategoryRepository;
import com.example.springsocial.repository.UserRepository;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Point;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


import java.util.Date;
import java.util.Optional;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class SpringSocialApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringSocialApplication.class, args);
	}

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private AddressRepository addressRepository;

	@Override
	public void run(String... args) throws Exception {
		/*Category category = new Category();
		category.setTitle("Artist");
		category.setDescription("List all your artistic offering on here. It includes DJ, Henna Artist, MUA so on so forth");
		categoryRepository.save(category);*/

		Optional<User> user = userRepository.findByEmail("suprit7@gmail.com");


		Address address = new Address();
		address.setStreet("14 Garfield Park");
		address.setApt("#B");
		address.setCity("Edison");
		address.setUserId(user.get().getId());
		address.setCountry("USA");
		address.setZipCode("08837");
		address.setCreatedAt(new Date());
		addressRepository.save(address);

	}

}
