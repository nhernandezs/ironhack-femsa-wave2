package com.demo.solid.solution;
/**
 * Se crea para SRP
 */
public class InventoryService {
    verifyInventory(order) {
        // Checks inventory levels
        if (inventory < order.quantity) {
            throw new Error("Out of stock");
        }
    }
}
