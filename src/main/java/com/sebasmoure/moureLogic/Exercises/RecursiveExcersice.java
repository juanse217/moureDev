package com.sebasmoure.moureLogic.Exercises;

public class RecursiveExcersice {
    public static void main(String[] args) {
        System.out.println(factorial(10));
        System.out.println(0);
        System.out.println(1);
        fibonacci(9);
    }

    private static int factorial(int n) {
        if (n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    private static int a = 0;
    private static int b = 1;
    private static int c = 0;

    private static int fibonacci(int n) {
        if (n <= 1) {
            return 1;
        }

        c = a + b;
        a = b;
        b = c;

        System.out.print(" " + c + " La posicion es " + n);
        return fibonacci(n - 1);

    }
}
