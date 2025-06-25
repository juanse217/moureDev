package com.sebasmoure.moureLogic;

import java.util.Arrays;
import java.util.stream.Stream;

public class DeletingCharacters {
    public static void main(String[] args) {
        deletingCharacters("Hola", "Olua");
        charDeleting("Hola", "Olua");
    }

    /*
     * Crea una función que reciba dos cadenas como parámetro (str1, str2)
     * e imprima otras dos cadenas como salida (out1, out2).
     * - out1 contendrá todos los caracteres presentes en la str1 pero NO
     * estén presentes en str2.
     * - out2 contendrá todos los caracteres presentes en la str2 pero NO
     * estén presentes en str1.
     */

    private static void charDeleting(String str1, String str2) {
        final String str1Lower = str1.toLowerCase();
        final String str2Lower = str2.toLowerCase();

        Object[] stream = str1Lower.chars().mapToObj(x -> (char) x)
                .filter(x -> str2Lower.chars().mapToObj(y -> (char) y).noneMatch(y -> x == y)).toArray();

        Object[] stream1 = str2Lower.chars().mapToObj(x -> (char) x)
                .filter(x -> str1Lower.chars().mapToObj(y -> (char) y).noneMatch(y -> x == y)).toArray();

        System.out.println(Arrays.toString(stream) + "      " + Arrays.toString(stream1));

    }

    private static void deletingCharacters(String str, String st) {
        String out = "";
        String out2 = "";

        str = str.toLowerCase();
        st = st.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (!st.contains(String.valueOf(str.charAt(i)))) {
                out += str.charAt(i);
            }
        }

        for (int i = 0; i < st.length(); i++) {
            if (!str.contains(String.valueOf(st.charAt(i)))) {
                out2 += st.charAt(i);
            }
        }

        System.out.println(out + " " + out2);
    }
}
