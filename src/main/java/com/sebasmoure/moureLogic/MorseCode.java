package com.sebasmoure.moureLogic;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.stream.events.EntityReference;

public class MorseCode {
    public static void main(String[] args) {
        
        System.out.println(morseCode("Hola"));
        System.out.println(morseCode("Hola mundo"));
        System.out.println(morseCode(".... . .-.. .-.. --- / .-- --- .-. .-.. -.."));
        System.out.println(morseCode(".... --- .-.. .- / -- ..- -. -.. ---"));
    }

    /*
     * Crea un programa que sea capaz de transformar texto natural a código
     * morse y viceversa.
     * - Debe detectar automáticamente de qué tipo se trata y realizar
     * la conversión.
     * - En morse se soporta raya "—", punto ".", un espacio " " entre letras
     * o símbolos y dos espacios entre palabras "  ".
     * - El alfabeto morse soportado será el mostrado en
     * https://es.wikipedia.org/wiki/Código_morse.
     */
    private static String morseCode(String s) {

        // se usa el mapa para usar key value.
        HashMap<Character, String> morseMap = new HashMap<>();

        // Letters A–Z. De esta forma porque java nos permite max 10 items con Map.of()
        morseMap.put('A', ".-");
        morseMap.put('B', "-...");
        morseMap.put('C', "-.-.");
        morseMap.put('D', "-..");
        morseMap.put('E', ".");
        morseMap.put('F', "..-.");
        morseMap.put('G', "--.");
        morseMap.put('H', "....");
        morseMap.put('I', "..");
        morseMap.put('J', ".---");
        morseMap.put('K', "-.-");
        morseMap.put('L', ".-..");
        morseMap.put('M', "--");
        morseMap.put('N', "-.");
        morseMap.put('O', "---");
        morseMap.put('P', ".--.");
        morseMap.put('Q', "--.-");
        morseMap.put('R', ".-.");
        morseMap.put('S', "...");
        morseMap.put('T', "-");
        morseMap.put('U', "..-");
        morseMap.put('V', "...-");
        morseMap.put('W', ".--");
        morseMap.put('X', "-..-");
        morseMap.put('Y', "-.--");
        morseMap.put('Z', "--..");

        // Numbers 0–9
        morseMap.put('0', "-----");
        morseMap.put('1', ".----");
        morseMap.put('2', "..---");
        morseMap.put('3', "...--");
        morseMap.put('4', "....-");
        morseMap.put('5', ".....");
        morseMap.put('6', "-....");
        morseMap.put('7', "--...");
        morseMap.put('8', "---..");
        morseMap.put('9', "----.");
        morseMap.put('-', "-....-");
        morseMap.put('.', ".-.-.-");
        morseMap.put(',', "--..--");

        // dividimos nuestro string por sus espacios para convertir texto en morse o
        // viceversa
        String[] arr = s.toUpperCase().split(" ");
        String ret = "";

        
        // morse.
        if (s.contains("a")) {

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length(); j++) {
                    ret += morseMap.get(arr[i].charAt(j)) + " ";

                }
                ret += "  ";
            }

        } else {
            //natural. 

            for (int i = 0; i < arr.length; i++) {

                for (Entry<Character, String> entry : morseMap.entrySet()) {
                    if (entry.getValue().equals(arr[i])) {
                        ret += entry.getKey();
                        break;
                    }
                }

                if (arr[i].contains("/")) {
                    ret += " ";
                }
            }

        }

        return ret;

    }
}
