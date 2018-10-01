package com.example.oauth2demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@RunWith(SpringRunner.class)
public class Oauth2DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void testUriComponentsBuilder() {
		UriComponents uri = UriComponentsBuilder.fromUriString("http://google.com/oauth2Redirect")
				.queryParam("token", "123")
				.build();
		System.out.println(uri.getScheme());
		System.out.println(uri.getHost());
		System.out.println(uri);
	}

}
