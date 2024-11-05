package com.demo.lab2.solid.solution;

public class StandarPaymentProcessor implements PaymentProcessor {
    @Override
    processPayment(Order order) {
        return expressPaymentService.process(order.amount, "highPriority");
    }
}
