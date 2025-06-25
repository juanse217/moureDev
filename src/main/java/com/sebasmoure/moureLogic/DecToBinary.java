package com.sebasmoure.moureLogic;

public class DecToBinary {
    /*
 * Crea un programa se encargue de transformar un número
 * decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
 */
    public static void main(String[] args) {
        System.out.println(decToBinary(13));
        System.out.println(decToBinary(1));
    }

    //Debemos dividir entre dos sucesivamente y el residuo (0 o 1) guardarlo al revés. 
    private static int decToBinary(int n){

        StringBuilder str = new StringBuilder();
        while(n > 0){
            str.append(n%2); 
            n /= 2;
        }

        return (Integer.valueOf(str.reverse().toString()));
      

    }
}
