package com.demo.lab4.security.scenario2;

public class JwtValidator {
    @Autowired
    private JwtUtil jwtUtil;

    public Claims validateJWT(String token) throws JwtException {
        Key secretKey = jwtUtil.getSecretKey();
        try {
            // Parsear el token y validar la firma y las reclamaciones
            return Jwts.parserBuilder()
                    .setSigningKey(secretKey)
                    .build()
                    .parseClaimsJws(token)
                    .getBody();
        } catch (JwtException e) {
            // La biblioteca jjwt lanzará excepciones si el token es inválido o caducado.
            throw new JwtException("Token inválido o expirado", e);
        }
    }
}