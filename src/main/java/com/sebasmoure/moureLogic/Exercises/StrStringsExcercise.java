package com.sebasmoure.moureLogic.Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class StrStringsExcercise {
    public static void main(String[] args) {
        checkingStrings("Hola", "Halo");
        checkingStrings("CarroneJa", "atenorraC");
        checkingStrings("Hola", "aloh");
        checkingStrings("murcielago", "murciela");
        checkingStrings("holaholaHola", "holaholaHola");
    }

    /*
     * DIFICULTAD EXTRA (opcional):
     * Crea un programa que analice dos palabras diferentes y realice comprobaciones
     * para descubrir si son:
     * - Palíndromos
     * - Anagramas
     * - Isogramas
     */

    private static void checkingStrings(String s, String s1) {

        // Avoiding case and punctuation issues
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        s1 = s1.toLowerCase().replaceAll("[^a-z0-9]", "");

        // Anagramas
        boolean anagram = false;
        if (s.length() != s1.length()) {
            System.out.println("Anagram " + anagram);
        } else {
            char[] sChar = s.toCharArray();
            char[] s1Char = s1.toCharArray();
            Arrays.sort(sChar);
            Arrays.sort(s1Char);

            System.out.println("Anagram " + Arrays.equals(sChar, s1Char));
        }

        // Palíndromos
        boolean palindrome = false;

        StringBuilder sb = new StringBuilder(s1);
        palindrome = sb.reverse().toString().equals(s);

        System.out.println("Palindrome " + palindrome);

        // Isogramas
        if (s.length() != s1.length()) {
            System.out.println("Isogram: " + false);
            System.out.println("-------------------");
        } else {
            HashMap<Character, Integer> map = new HashMap<>();
            char[] arr = s.toCharArray();
            // cargando el mapa
            for (char i : arr) {
                map.put(i, 0);
            }

            for (char c : arr) {
                int value = 1;
                for (Entry<Character, Integer> entry : map.entrySet()) {
                    if (entry.getKey().equals(c)) {
                        value = entry.getValue() + 1;
                        map.put(c, value);
                    }
                }
            }

            boolean isogram = true;
            Integer isogramVal = (Integer) map.values().toArray()[0];
            
            for (int c : map.values()) {
                // for (int j : map.values()) {
                // }
                if (c != isogramVal) {
                    isogram = false;
                    break;
                }
            }

            System.out.println("Isogram " + isogram);
            System.out.println("-----------------------");
        }

    }

}
