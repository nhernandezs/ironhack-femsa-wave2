package com.demo.lab4.security.scenario1;

/**
 * Recomendaciones adicionales:
 *  1. Librerías actualizadas para evitar que tengan vulnerabilidades.
 *  2. Configurar SonarQube.
 *  3. Configurar Lint.
 *  4. Configurar repositorio para que otros desarrolladores hagan revisión.
 *  5. Configurar Snyk.
 *  6. Configurar StackHawk.
 *  7. Realizar pruebas de penetración.
 */


public class Authenticator {
    @Autowired
    UserRepository repo;

    @Autowired
    Encrypter encrypter;

    @Autowired
    Sanitizer sanitizer;

    public boolean authenticateUser(String username, String password) {
        try {
            // Log de operaciones pero no de datos sensibles.
            Logger.info("Authentication requested {0}", username);
            // Se sanitizan los campos para evitar inyecciones.
            sanitizer.validate(username);
            sanitizer.validate(password);

            User found = repo.findByUsername(username);

            String storedUsername = found.getUserName();
            String storedPassword = found.getPassword(); // La contraseña debe estar encriptada.


            String encrypted = encrypter.encrypt(password); // Se encripta el password recibido para la comparación.

            //Se compara el dato de entrada encriptado.
            if (storedPassword.equals(encrypted)) {
                return true;
            } else {
                return false;
            }
        } catch (RuntimeException runtimeException) {
            // Manejo de excepciones y evitar regresar información de la tecnología que se usa.
            Logger.error("Auth error", runtimeException);
            return false;
        }

    }
}
