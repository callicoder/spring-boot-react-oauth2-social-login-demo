package com.example.springsocial.util;

import lombok.Getter;

@Getter
public enum JwtUtils {
    USER_ID("idUsuario"),
    NOME("nome"),
    SOBRENOME("sobrenome"),
    EGRESSO("isEgresso"),
    SCOPE("scope");

    private String propriedade;

    private JwtUtils(String propriedade) {
        this.propriedade = propriedade;
    }
}
