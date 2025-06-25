package com.sebasmoure.moureLogic;

public class Factorial {
    public static void main(String[] args) {
        //factorial(3);
        System.out.println(factorial(10));
    }

    /*
 * Escribe una función que calcule y retorne el factorial de un número dado
 * de forma recursiva.
 */
    private static int factorial(int n){
        if(n == 1) return n;

        
        return n * factorial(n-1);
    }
}
