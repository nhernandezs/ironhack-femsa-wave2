package com.demo.lab2.solid.solution.dto;

public class ExpresOrder extends GenericOrder implements PriorizableI{
    @Override
    public void processOrder() {
        System.out.println("Processing express order...");
        // Lógica específica para procesar un pedido exprés
    }

    @Override
    public setUpPriorization(priority) {
        priority = priority;
    }
}
