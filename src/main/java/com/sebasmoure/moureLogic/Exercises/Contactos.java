package com.sebasmoure.moureLogic.Exercises;

import java.util.HashMap;
import java.util.Scanner;

/* DIFICULTAD EXTRA (opcional):
 * Crea una agenda de contactos por terminal.
 * - Debes implementar funcionalidades de búsqueda, inserción, actualización
 *   y eliminación de contactos.
 * - Cada contacto debe tener un nombre y un número de teléfono.
 * - El programa solicita en primer lugar cuál es la operación que se quiere realizar,
 *   y a continuación los datos necesarios para llevarla a cabo.
 * - El programa no puede dejar introducir números de teléfono no numéricos y con más
 *   de 11 dígitos (o el número de dígitos que quieras).
 * - También se debe proponer una operación de finalización del programa.
 */
public class Contactos {
    // se hará la implementacion con un HashMap, siendo el nombre la key y el num el
    // value
    private static HashMap<String, String> map = new HashMap<>(); // solo accesible pora esta clase
    private static Scanner sc = new Scanner(System.in); // inicializar Scanner para no hacerlo en cada iteración.

    public static void main(String[] args) {
        System.out.println("Welcome to your contact list"); // Bienvenida

        int exit = 0; // valor de decision initialized.
        while (exit != 5) {
            System.out.println(
                    "What would you like to do?\n1. Add contact.\n2. Delete contact.\n3. Update contact info.\n4. Search\n5. Exit.\n\nMAKE SURE TO ENTER A DIGIT");

            try {
                switch (sc.nextInt()) {
                    case 1:
                        add();
                        break;
                    case 2:
                        delete();
                        break;
                    case 3:
                        update();
                        break;
                    case 4:
                        search();
                        break;
                    case 5:
                        System.exit(0);
                        break;
                }

            } catch (Exception e) {
                throw e;
                //System.exit(1);
            }
        }
    }

    private static void add() {
        System.out.println("Dame el nombre del contacto:\n");
        String name = sc.next();
        // sc.next();
        System.out.println("Dame el número del contacto");
        String number = sc.next();
        if(number.length() > 11){
            System.out.println("Debe ser menor a 11 dīgitos");
            add();

        }
        // sc.next();
        map.put(name, number);
        System.out.println(map);
    }

    private static void delete() {
        System.out.println("Dame el nombre del contacto:\n");
        String name = sc.next();
        map.remove(name);
    }

    private static void update() {
        System.out.println("Dame el nombre del contacto:\n");
        String name = sc.next();

        System.out.println("Dame el nuevo número del contacto");
        String number = sc.next();
        map.replace(name, number);
    }

    private static void search() {
        System.out.println("Dame el nombre del contacto:\n");
        String name = sc.next();
        System.out.println("El número del contacto es: " + map.get(name));
    }

}
