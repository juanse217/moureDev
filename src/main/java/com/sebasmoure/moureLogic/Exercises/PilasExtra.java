package com.sebasmoure.moureLogic.Exercises;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

import com.sebasmoure.moureLogic.Pila;

public class PilasExtra {
    /*
     * DIFICULTAD EXTRA (opcional):
     * - Utilizando la implementación de pila y cadenas de texto, simula el
     * mecanismo adelante/atrás
     * de un navegador web. Crea un programa en el que puedas navegar a una página o
     * indicarle
     * que te quieres desplazar adelante o atrás, mostrando en cada caso el nombre
     * de la web.
     * Las palabras "adelante", "atrás" desencadenan esta acción, el resto se
     * interpreta como
     * el nombre de una nueva web.
     */

    public static void main(String[] args) {
        // usando arraylist

        Pila<String> stack = new Pila<>();
        Scanner sc = new Scanner(System.in);
        String popped = "cacca";
        while (true) {
            System.out.println("Que deseas hacer? ingresar/atras/adelante/salir");
            String action = sc.nextLine();

            if (action.equals("salir")) {

                sc.close();
                System.exit(0);

            } else if (action.equals("ingresar")) {

                System.out.println("Dame el website: ");
                stack.push(sc.nextLine());

            } else if (action.equals("atras")) {

                if (stack.size() > 0) {
                    popped = stack.pop();
                }

            } else if (action.equals("adelante")) {
                stack.push(popped);

            } else {
                main(null);
            }

            if(stack.size() > 0){
                System.out.println("Navegaste  " + stack.get(stack.size()-1));
            }else{
                System.out.println("Pagina principal");
            }
        }
    }

}
