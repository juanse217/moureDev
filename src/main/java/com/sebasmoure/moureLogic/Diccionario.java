package com.sebasmoure.moureLogic;

import java.util.HashMap;

public class Diccionario {
    /*
     * DIFICULTAD EXTRA (opcional):
     * Crea un diccionario con las siguientes claves y valores:
     * "name": "Tu nombre"
     * "age": "Tu edad"
     * "birth_date": "Tu fecha de nacimiento"
     * "programming_languages": ["Listado de lenguajes de programación"]
     * Crea dos test:
     * - Un primero que determine que existen todos los campos.
     * - Un segundo que determine que los datos introducidos son correctos.
     */

    public static HashMap<String, String> dictionary() {
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "Sebastian");
        map.put("age", "20");
        map.put("birthDate", "8 septiembre");
        map.put("programmingLanguages", "Java, python");

        return map;

    }

}
