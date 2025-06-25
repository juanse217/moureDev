package com.sebasmoure.moureLogic;

import java.util.Arrays;
import java.util.Locale;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.*;

public class Anagram {
    /*
     * Escribe una función que reciba dos palabras (String) y retorne
     * verdadero o falso (Bool) según sean o no anagramas.
     * - Un Anagrama consiste en formar una palabra reordenando TODAS
     * las letras de otra palabra inicial.
     * - NO hace falta comprobar que ambas palabras existan.
     * - Dos palabras exactamente iguales no son anagrama.
     */
    public static void main(String[] args) {
        System.out.println(anagram("Hola", "Halo"));
        System.out.println(anagram("amor", "roma"));
        System.out.println(anagram("netaJose", "oseneta"));
        System.out.println(anagram("Carroneja", "atenorraC"));

    }

    private static boolean anagram(String a, String b) {
        if (a.length() != b.length())
            return false;

        char[] aChar = a.toCharArray();
        char[] bChar = b.toCharArray();
        Arrays.sort(aChar);
        Arrays.sort(bChar);

        return Arrays.equals(aChar, bChar);
    }
}
