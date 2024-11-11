package com.demo.lab7.designpattern.scenario4;

public class AsyncApp {
    public static void main(String[] args) {
        // Procesar múltiples tareas asíncronas
        CompletableFuture<Void> future1 = CompletableFuture.runAsync(() -> {
            System.out.println("Proceso 1 ejecutándose en: " + Thread.currentThread().getName());
            simulateWorkload("Proceso 1");
        });

        CompletableFuture<Void> future2 = CompletableFuture.runAsync(() -> {
            System.out.println("Proceso 2 ejecutándose en: " + Thread.currentThread().getName());
            simulateWorkload("Proceso 2");
        });

        CompletableFuture<Void> future3 = CompletableFuture.runAsync(() -> {
            System.out.println("Proceso 3 ejecutándose en: " + Thread.currentThread().getName());
            simulateWorkload("Proceso 3");
        });

        // Continuar la ejecución en el hilo principal sin bloquearlo
        System.out.println("Ejecución del hilo principal: " + Thread.currentThread().getName());

        // Esperar a que todos los procesos asíncronos terminen
        CompletableFuture<Void> allOf = CompletableFuture.allOf(future1, future2, future3);
        try {
            allOf.get(); // Esto bloqueará el hilo actual hasta que todas las tareas terminen
            System.out.println("Todos los procesos han finalizado.");
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    private static void simulateWorkload(String process) {
        try {
            Thread.sleep(2000); // Simula una carga de trabajo que lleva 2 segundos
            System.out.println(process + " ha completado su ejecución.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
