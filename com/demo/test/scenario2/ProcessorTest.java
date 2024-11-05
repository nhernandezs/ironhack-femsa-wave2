package com.demo.test.scenario2;

public class ProcessorTest {
    /**
     * Se utiliza un mock para que el repo
     */
    @Mock
    Repository repository;

    Processor processor;
    /**
     * Se prepara cada caso de prueba para mockear el
     * repo e inicializar el procesador.
     */
    @BeforeEach
    void setUp() {
        repository = Mockito.mock(UserRepository.class);
        // Preparar el servicio
        processor = new Processor(repository);

    }

    /**
     * El caso de prueba de éxito se separa del de error.
     */
    @Test
    void processData_ShouldBeSuccess() {
        List<Data> mockData = List.of(new Data("a"), new Data("b"));
        Mock.when(repository.fetchData(Mockito.any())).thenReturn(mockData);

        List<Data> inputData = List.of(new Data("a"), new Data("b"));
        Assertions.assertTrue(processor.processData(inputData));
    }

    /**
     * Se separa el caso de prueba de cuando existe una excepción.
     */
    @Test
    void processData_WithRepoException_ShouldHandleException() {
        List<Data> mockData = List.of(new Data("a"), new Data("b"));
        Mock.when(repository.fetchData(Mockito.any())).thenThrow(new RuntimeException());

        List<Data> inputData = List.of(new Data("a"), new Data("b"));
        assertThrows(RuntimeException.class, () -> processor.processData(inputData));
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
