package com.demo.lab2.solid.solution;

/**
 * Se crea para SRP
 */
public class ExpresPaymentProcessor implements PaymentProcessor {
    @Override
    processPayment(Order order) {
        // Lógica para el pago estándar
        return paymentService.process(order.amount);
    }
}
