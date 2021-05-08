package com.anubha.security.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class AutenticationResponse {
    private final String jwt;
}
