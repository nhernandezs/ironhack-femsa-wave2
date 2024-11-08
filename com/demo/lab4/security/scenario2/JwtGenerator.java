package com.demo.lab4.security.scenario2;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import java.util.Date;
import java.security.Key;

public class JwtGenerator {
    @Autowired
    private JwtUtil jwtUtil;


    public String generateJWT(String userCredentials) {
        Key secretKey = jwtUtil.getSecretKey();
        if (validateCredentials(userCredentials)) {
            long currentTimeMillis = System.currentTimeMillis();
            long oneHourInMillis = 3600 * 1000; // 1 hora

            // Jwts genera un token, no debemos agregar las credenciales. Se agrega la expiración.
            return Jwts.builder()
                    .setSubject(subject)
                    .setIssuer("myapp")
                    .setIssuedAt(new Date(currentTimeMillis))
                    .setExpiration(new Date(currentTimeMillis + oneHourInMillis))
                    .signWith(secretKey) // clave de firma
                    .compact();

        } else {
            return "error";
        }
    }

    private boolean validateCredentials(String userCredentials) {
        // Algoritmo de validación
        return true;
    }
}
