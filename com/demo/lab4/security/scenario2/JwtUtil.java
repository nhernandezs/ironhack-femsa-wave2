package com.demo.lab4.security.scenario2;

public class JwtUtil {
    private Key secretKey;

    public JwtUtil() {
        // Leer la clave secreta desde una variable de entorno para que no esté en código duro.
        String secret = System.getenv("JWT_SECRET_KEY");
        if (secret != null) {
            byte[] keyBytes = Base64.getDecoder().decode(secret);
            this.secretKey = Keys.hmacShaKeyFor(keyBytes);
        } else {
            throw new IllegalStateException("No se encontró la variable de entorno 'JWT_SECRET_KEY'");
        }
    }

    public Key getSecretKey() {
        return secretKey;
    }
}
