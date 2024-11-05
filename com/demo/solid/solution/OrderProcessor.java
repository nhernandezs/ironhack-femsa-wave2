package com.demo.solid.solution;

import com.demo.solid.solution.dto.ExpresOrder;
import com.demo.solid.solution.dto.StandarOrder;

import java.util.List;

public class OrderProcessor {
    // Se inyectan como parte de ISP
    @Autowired
    InventoryService inventoryService;
    @Autowired
    OrderStatusUpdater orderStatusUpdater;
    @Autowired
    NotificationService notificationService;
    public static void main() {
        // Se usa GenericOrder para LSP
        GenericOrder so1 = new StandarOrder();
        GenericOrder so2 = new StandarOrder();
        GenericOrder eo1 = new ExpresOrder();
        eo1.setUpPriorization("highest");

        List<GenericOrder> list = List.of(so1, so2, eo1);

        list.forEach(OrderProcessor::processOrder);
    }

    public static void processOrder(GenericOrder order) {
        inventoryService.verifyInventory(order);
        order.processOrder(); // LSP y OCP
        orderStatusUpdater.updateOrderStatus(order, "processed");
        notificationService.notifyCustomer(order);
    }
}
