package com.demo.test.scenario1;

public class AuthenticatorTest {
    /**
     * Se utiliza un mock para que el repo
     */
    @Mock
    UserRepository repository;

    Autenticator autenticator;

    /**
     * Se prepara cada caso de prueba para mockear el
     * repo e inicializar el servicio de autenticación.
     */
    @BeforeEach
    void setUp() {
        repository = Mockito.mock(UserRepository.class);
        // Preparar el servicio
        authenticator = new Autenticator(repository);

    }

    /**
     * El caso de prueba de éxito se separa del de error.
     */
    @Test
    void authenticate_WithValidCredentials_ShouldBeSuccess() {
        User mockUser = new User("validUser", "validPass");
        Mock.when(repository.findByName(Mockito.any())).thenReturn(mockUser);
        Assertions.assertTrue(authenticator.authenticate("validUser", "validPass"));
    }

    @Test
    void authenticate_WithWrongCredentials_ShouldFail() {
        User mockUser = new User("validUser", "other");
        Mock.when(repository.findByName(Mockito.any())).thenReturn(mockUser);
        Assertions.assertFalse(authenticator.authenticate("validUser", "validPass"));
    }

    /**
     * Se depura el repositorio después de finalizar cada
     * caso de prueba.
     */
    @AfterEach
    void tearDown() {
        Mockito.reset(repository);
    }
}
