package com.sebasmoure.moureLogic;

import java.util.Scanner;

public class Excepciones {
    /*
     * EJERCICIO:
     * Explora el concepto de manejo de excepciones según tu lenguaje.
     * Fuerza un error en tu código, captura el error, imprime dicho error
     * y evita que el programa se detenga de manera inesperada.
     * Prueba a dividir "10/0" o acceder a un índice no existente
     * de un listado para intentar provocar un error.
     */

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};

        try{
            System.out.println("Dame la posicion que quieres acceder: ");
            int i = sc.nextInt();
            System.out.println(arr[i]);
        }catch(IndexOutOfBoundsException e){
            System.out.println("Te saliste del arreglo, debe ser menor a " + arr.length);
            main(null);
        }
     }

}
