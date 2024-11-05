package com.demo.lab2.solid.solution;
/**
 * Se crea para SRP
 */
public class NotificationService {
    notifyCustomer(order) {
        // Sends an email notification to the customer
        emailService.sendEmail(order.customerEmail, "Your order has been processed.");
    }
}
