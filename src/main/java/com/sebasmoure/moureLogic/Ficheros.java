package com.sebasmoure.moureLogic;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ficheros {
    /*
     * EJERCICIO:
     * Desarrolla un programa capaz de crear un archivo que se llame como
     * tu usuario de GitHub y tenga la extensión .txt.
     * Añade varias líneas en ese fichero:
     * - Tu nombre.
     * - Edad.
     * - Lenguaje de programación favorito.
     * Imprime el contenido.
     * Borra el fichero.
     */
    public static void main(String[] args) {

        FileWriter writer = null;

        try {
            System.out.println("Creando archivo y agregando lineas: ");

            writer = new FileWriter("usuarios.txt");
            writer.write("Sebastian\n");
            writer.write("20\n");
            writer.write("Java\n");

        } catch (IOException e) {

            System.out.println("Error con input: " + e.getMessage());

        } finally {

            try {
                writer.close();
            } catch (IOException e) {
                System.out.println(e.getCause());
            }

        }

        File file = new File("usuarios.txt");
        Scanner sc = null;
        try {

            System.out.println("Leyendo lineas de archivos: ");

            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                System.out.println(linea);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            sc.close(); //cerrar recursos
            file.delete(); //eliina el archivo creado.
        }

    }
}
