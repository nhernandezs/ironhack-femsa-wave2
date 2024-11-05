package com.demo.lab2.solid.solution;
/**
 * Se crea para LCP y OCP
 */
public interface PaymentProcesorI {
    boolean processPayment(Order order);
}
