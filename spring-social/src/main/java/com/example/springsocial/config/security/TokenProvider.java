package com.example.springsocial.config.security;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.jwt.JwtClaimsSet;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.JwtEncoderParameters;
import org.springframework.stereotype.Service;

import com.example.springsocial.config.properties.TokenProperties;
import com.example.springsocial.model.User;
import com.example.springsocial.util.JwtUtils;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TokenProvider {

    private final JwtEncoder jwtEncoder;
    private final JwtDecoder jwtDecoder;

    private final TokenProperties tokenProperties;

    public String createToken(Authentication authentication) {
        User userPrincipal = (User) authentication.getPrincipal();
        Instant now = Instant.now();

        var jwtClaimsSet = JwtClaimsSet.builder()
                .issuer("API Meu Egresso - UFPA")
                .subject(userPrincipal.getUsername())
                .issuedAt(now)
                .expiresAt(now.plus(tokenProperties.getExpiresHours(), ChronoUnit.HOURS))
                .claim(JwtUtils.NOME.getPropriedade(), userPrincipal.getName())
                .claim(JwtUtils.USER_ID.getPropriedade(), userPrincipal.getId())
                .claim(JwtUtils.SCOPE.getPropriedade(), authentication.getAuthorities());
        return jwtEncoder.encode(JwtEncoderParameters.from(jwtClaimsSet.build())).getTokenValue();
    }

    public Integer getUserIdFromToken(String token) {
        Jwt jwt = jwtDecoder.decode(token);
        return Integer.parseInt(jwt.getClaim(JwtUtils.USER_ID.getPropriedade()).toString());
    }

    public boolean validateToken(String authToken) {
        return (!isTokenExpired(authToken));
    }

    private boolean isTokenExpired(String token) {
        Instant exp = jwtDecoder.decode(token).getExpiresAt();
        if (exp != null) {
            return exp.isBefore(Instant.now());
        } else {
            return true;
        }
    }
}
