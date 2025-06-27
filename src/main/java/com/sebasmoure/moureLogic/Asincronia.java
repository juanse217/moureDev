package com.sebasmoure.moureLogic;

import java.util.Date;

public class Asincronia {
    /**
     * EJERCICIO:
     * Utilizando tu lenguaje, crea un programa capaz de ejecutar de manera
     * asíncrona una función que tardará en finalizar un número concreto de
     * segundos parametrizables. También debes poder asignarle un nombre.
     * La función imprime su nombre, cuándo empieza, el tiempo que durará
     * su ejecución y cuando finaliza.
     */

    /*
     * En java tenemos varias maneras de manejar la asincronia: 
     * Threads
     * ExecutorService
     * CompletableFuture
     * Callbacks
     * 
     * extendiendo la interfaz runnable (aplicado en las clases que queremos correr), podemos lleval threads a clases
     */

     public static void main(String[] args) {
        
        Thread thread = new Thread(() -> asynchronousFunction("Sebastian", 5000));
        thread.start();
        
     }

     private static void asynchronousFunction(String name, long miliseconds){
        long start = System.currentTimeMillis();
        
        try {
            int seconds = (int) (miliseconds*0.001);
            System.out.printf("Me voy a demorar %d segundos y mi nombre es %s\n", seconds, name);
            Thread.sleep(miliseconds);
            System.out.println("Tarea 1");
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
        
        float time = (System.currentTimeMillis() - start) /1000f;
        System.out.printf("Me demoré %.1f segundos\n", (time));
     }

}
