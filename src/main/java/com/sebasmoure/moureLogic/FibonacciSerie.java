package com.sebasmoure.moureLogic;

public class FibonacciSerie {

    public static void main(String[] args) {
        fibonacciSeries();
        System.out.println();
        fibonacciR(50);
    }

    private static void fibonacciSeries(){
        long i = 0;
        long j = 1;
        long z = 0;

        System.out.print(i);
        System.out.print(j);
        for (int k = 0; k < 50 ; k++) {
            z = i + j;
            i = j;
            j = z;
            System.out.print(j + " ");
        }
    }

    private static int a = 0;
    private static int b = 1;
    private static int z = 0;

    private static int fibonacciR(int count){
        if(count <= 1){
            return 1;
        }

        z = a + b;
        a = b;
        b = z;
        System.out.print(" " + z);
        return fibonacciR(count-1);
    }
}
