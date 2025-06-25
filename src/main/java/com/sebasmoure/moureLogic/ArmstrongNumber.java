package com.sebasmoure.moureLogic;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(armstrongNumber(153));
        System.out.println(armstrongNumber(377));
    }

    /*
 * Escribe una función que calcule si un número dado es un número de Armstrong
 * (o también llamado narcisista).
 * Si no conoces qué es un número de Armstrong, debes buscar información
 * al respecto.
 */

    private static boolean armstrongNumber(int n){
       String str = String.valueOf(n);
       int numOfDigits = str.length();
       int sum = 0;

       for (int i = 0; i < numOfDigits; i++) {
       // parseamos cada char a String y luego a Integer porque los char son primitivos que parseados se pueden considerar nums, afectando el funcionamiento
        int parsed = Integer.parseInt((String.valueOf(str.charAt(i))));
        sum += (int) Math.pow(parsed, numOfDigits);
       }

       System.out.println(n + " " + sum);
       return n == sum;
    }
}
