package com.sebasmoure.moureLogic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Iteraciones {
    /*
 * EJERCICIO:
 * Utilizando tu lenguaje, emplea 3 mecanismos diferentes para imprimir
 * números del 1 al 10 mediante iteración.
 *
 * DIFICULTAD EXTRA (opcional):
 * Escribe el mayor número de mecanismos que posea tu lenguaje
 * para iterar valores. ¿Eres capaz de utilizar 5? ¿Y 10?
 */
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        int i =1;

        while (i <= 10) {
            System.out.println(i++);
        }

        int j = 1;
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = new int[10];
        do{
            list.add(j);
            arr[j-1] = j; 
            System.out.println(j++);
        }while(j <= 10);

        list.forEach(number -> System.out.println(number));

        Arrays.stream(arr).forEach(number -> System.out.println(number));
        
    }
}   
