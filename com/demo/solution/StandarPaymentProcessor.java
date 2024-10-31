package com.demo.solution;

public class StandarPaymentProcessor implements PaymentProcessor {
    @Override
    processPayment(Order order) {
        return expressPaymentService.process(order.amount, "highPriority");
    }
}
