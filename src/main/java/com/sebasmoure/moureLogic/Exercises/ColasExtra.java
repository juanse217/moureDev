package com.sebasmoure.moureLogic.Exercises;

import java.util.Scanner;

import com.sebasmoure.moureLogic.Cola;

public class ColasExtra {
    /*
     * - Utilizando la implementación de cola y cadenas de texto, simula el
     * mecanismo de una
     * impresora compartida que recibe documentos y los imprime cuando así se le
     * indica.
     * La palabra "imprimir" imprime un elemento de la cola, el resto de palabras se
     * interpretan como nombres de documentos.
     */
    public static void main(String[] args) {
        Cola<String> q = new Cola<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Que deseas hacer: agregar/imprimir/salir");
            String action = sc.nextLine();
            if (action.equals("salir")) {
                sc.close();
                System.exit(0);
            } else if (action.equals("agregar")) {
                System.out.println("Dame el nombre del archivo: ");
                q.push(sc.nextLine());
            } else if (action.equals("imprimir")) {
                if (q.size() > 0)
                    System.out.println("imprimiendo: " + q.pop());
            } else {
                System.out.println("Error");
                main(null);
            }
        }

    }
}
