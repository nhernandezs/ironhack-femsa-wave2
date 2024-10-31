package com.demo.solution;
/**
 * Se crea para SRP
 */
public class OrderStatusUpdater {
    updateOrderStatus(order, status) {
        // Updates the order status in the database
        database.updateOrderStatus(order.id, status);
    }
}
