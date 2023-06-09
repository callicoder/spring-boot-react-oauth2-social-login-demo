package com.example.springsocial.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@ConfigurationProperties(prefix = "token")
public class TokenProperties {

	/**
	 * Tempo em horas para expirar o token
	 *
	 */
	private Integer expiresHours;

	private String domain;

	public Integer getExpiresHours() {
		return expiresHours;
	}

	public void setExpiresHours(Integer expiresHours) {
		this.expiresHours = expiresHours;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

}
