package com.sebasmoure.moureLogic;

import static java.util.Arrays.setAll;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordCount {

    /*
     * Crea un programa que cuente cuantas veces se repite cada palabra
     * y que muestre el recuento final de todas ellas.
     * - Los signos de puntuación no forman parte de la palabra.
     * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
     * - No se pueden utilizar funciones propias del lenguaje que
     * lo resuelvan automáticamente.
     */

    public static void main(String[] args) {
        System.out.println(wordCount("Hola mundo HOLA hola mundo, hola HOla.Mundo MUNDO"));
        System.out.println(wordCount("Hola, mi nombre es brais. Mi nombre completo es Brais Moure (MoureDev)."));
        System.out.println(wordCount("Hol mundo cruel, esto es lo que pasa cuando no se hace hola"));

        System.out.println(wordCount("Celular hola, carro, celular miau"));

    }

    private static Map<String, Integer> wordCount(String s) {
        String str = s.trim().toLowerCase();
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        // String[] arr = str.replaceAll("(\\W+\\s+ | \\s\\W)", " ").split("[^a-z]");
        String[] arr = str.replaceAll("[^a-z0-9]", " ").replaceAll("\\s{2,}", " ").split(" ");

        for (String string : arr) {
            System.out.println(string);
        }

        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].isBlank()) {
                map.putIfAbsent(arr[i], 0);
            }

        }

        for (String string : arr) {
            if (map.containsKey(string)) {
                int value = map.get(string) + 1;
                map.put(string, value);

            }
        }

        // System.out.println(Arrays.toString(arr));
        return map;

    }
}
