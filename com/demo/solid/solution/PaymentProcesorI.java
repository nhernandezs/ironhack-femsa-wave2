package com.demo.solid.solution;
/**
 * Se crea para LCP y OCP
 */
public interface PaymentProcesorI {
    boolean processPayment(Order order);
}
