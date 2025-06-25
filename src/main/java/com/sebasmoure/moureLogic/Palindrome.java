package com.sebasmoure.moureLogic;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome("Ana lleva al oso la avellaa."));
        System.out.println(palindromeFunctional("Ana lleva al oso la avellan."));
    }

    /*
     * Escribe una función que reciba un texto y retorne verdadero o
     * falso (Boolean) según sean o no palíndromos.
     * Un Palíndromo es una palabra o expresión que es igual si se lee
     * de izquierda a derecha que de derecha a izquierda.
     * NO se tienen en cuenta los espacios, signos de puntuación y tildes.
     * Ejemplo: Ana lleva al oso la avellana.
     */

    private static boolean palindrome(String isPalindrome) {

        boolean areSame = true;
        // We'll keep only the values that are characters.
        String ret = isPalindrome.toLowerCase().replaceAll("[^a-z0-9]", "");
        isPalindrome = isPalindrome.toLowerCase().replaceAll("[^a-z0-9]", "");

        // go trough each character from last to first and compare with original string.
        int len = ret.length();
        int j = 0; // it'll update for each iteration. Not using double loop because the inner loop
                   // will go through all the elements first which will return false.
        for (int i = len - 1; i >= 0; i--) {
            areSame = ret.charAt(i) == isPalindrome.charAt(j++) ? true : false;

            // si areSame es falso, no es palindormo por lo que usamos if negado para salir.
            if (!areSame) {
                return false;
            }
        }

        return areSame;

    }

    private static boolean palindromeFunctional(String s) {
        // removemos espacios y signos.
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        // st para usar .reverse()
        StringBuilder st = new StringBuilder(s);
        st = st.reverse();

        // retornamos si son iguales
        return st.toString().equals(s);

    }
}
