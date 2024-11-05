package com.demo.test.scenario3;

public class UiResponsivenessTest {

    /**
     * Se genera una prueba parametrizada para evaluar
     * diferentes casos
     * @param input
     * @param adjusted
     */
    @ParameterizedTest
    @CsvSource({
            "512, 512",
            "1024, 1024",
            "2048, 2048"
    })
    void adjustsToScreenSize_WithValidValue_ShouldAdjustWidth(Integer input, Integer adjusted) {
        UiComponent component = setupUIComponent(1024);
        component.adjustsToScreenSize(adjusted);
        Assertions.assertEquals(adjusted, component.getWidth());
    }

}
