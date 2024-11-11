package com.demo.lab7.designpattern.scenario2;

public class FactoryApp {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();

        Notification notification = factory.createNotification("EMAIL");
        notification.notifyUser();

        notification = factory.createNotification("SMS");
        notification.notifyUser();

        notification = factory.createNotification("PUSH");
        notification.notifyUser();
    }
}
