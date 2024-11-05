package com.demo.solid.solution.dto;

public class StandarOrder extends GenericOrder {
    @Override
    public void processOrder() {
        System.out.println("Processing standard order...");
        // Lógica específica para procesar un pedido estándar
    }
}
