package com.sebasmoure.moureLogic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] args) {
        // Ejercicio
        regexExercise();

        //Extra
        regexExtra();
    }

    /*
     * EJERCICIO:
     * Utilizando tu lenguaje, explora el concepto de expresiones regulares,
     * creando una que sea capaz de encontrar y extraer todos los números
     * de un texto.
     */
    private static void regexExercise() {
        String texto = "111222aaaabbcccCCOED1111DODECURUnos1111999";

        String resultado = texto.replaceAll("[^0-9]", "");
        System.out.println(resultado);
    }

    /*
     * DIFICULTAD EXTRA (opcional):
     * Crea 3 expresiones regulares (a tu criterio) capaces de:
     * - Validar un email.
     * - Validar un número de teléfono.
     * - Validar una url.
     */

     private static void regexExtra(){
        String email = "mario19@gmail.com";
        String phoneNumber = "419-276-5913";
        String url = "https://retosdeprogramacion.com/roadmap/";

        Pattern patternEmail = Pattern.compile("\\w+@\\w+\\.\\w+");
        Matcher matcherEmail = patternEmail.matcher(email);

        Pattern patternNumber = Pattern.compile("([0-9]+-?)");
        Matcher matcherNumber = patternNumber.matcher(phoneNumber);

        Pattern patternUrl = Pattern.compile("\\w+:\\/\\/\\w+\\.(\\w+\\/)+");
        Matcher matcherUrl = patternUrl.matcher(url);



        if(matcherEmail.find()){
            System.out.println("Hola "  + email);
        }
        
        if(matcherNumber.find()){
            System.out.println("Hola " + phoneNumber);
        }

        if (matcherUrl.find()) {
            System.out.println("Hola " + url);
        }
     }

}
