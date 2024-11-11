package com.demo.lab7.designpattern.scenario2;

public class SmsNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Enviando notificación por SMS");
    }
}
