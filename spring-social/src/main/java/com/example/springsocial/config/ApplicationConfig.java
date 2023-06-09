package com.example.springsocial.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.springsocial.config.properties.CorsProperties;
import com.example.springsocial.config.properties.OauthProperties;
import com.example.springsocial.config.properties.RsaKeyProperties;
import com.example.springsocial.config.properties.TokenProperties;
import com.example.springsocial.service.UsuarioService;

import lombok.RequiredArgsConstructor;

/**
 * Responsável pelas configurações gerais da aplicação.
 *
 * @author Alfredo Gabriel
 * @since 26/03/2023
 * @version 1.0
 */
@Configuration
@RequiredArgsConstructor
@EnableConfigurationProperties(value = { RsaKeyProperties.class, TokenProperties.class, CorsProperties.class,
		OauthProperties.class })
public class ApplicationConfig {

	private final UsuarioService usuarioService;

	@Bean
	public UserDetailsService userDetailsService() {
		return usuarioService;
	}

	@Bean
	public AuthenticationManager authenticationManager() {
		DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
		authenticationProvider.setUserDetailsService(userDetailsService());
		return new ProviderManager(authenticationProvider);
	}

}
