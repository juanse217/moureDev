package com.sebasmoure.moureLogic.Exercises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FicherosExtra {
    /*
     * DIFICULTAD EXTRA (opcional):
     * Desarrolla un programa de gestión de ventas que almacena sus datos en un
     * archivo .txt.
     * - Cada producto se guarda en una línea del archivo de la siguiente manera:
     * [nombre_producto], [cantidad_vendida], [precio].
     * - Siguiendo ese formato, y mediante terminal, debe permitir añadir,
     * consultar,
     * actualizar, eliminar productos y salir.
     * - También debe poseer opciones para calcular la venta total y por producto.
     * - La opción salir borra el .txt.
     */
    public static void main(String[] args) throws IOException {
        // inicalizamos nuestros elementos para el file
        File file = null;
        FileWriter fw = null;
        BufferedReader reader = null;

        try {
            file = new File("Ventas.txt");
            fw = new FileWriter(file);

            while (true) {
                Scanner sc = new Scanner(System.in);

                // inicializar scanner y recibir decision
                System.out
                        .println("Que deseas hacer: 1. Anadir 2.Consultar 3. Actualizar 4.Eliminar producto 5. Salir");
                int decision = sc.nextInt();
                sc.nextLine();

                // if para proceder segun decision:
                if (decision == 5) {
                    sc.close();
                    fw.close();
                    file.delete();
                    System.exit(0);
                } else if (decision == 1) {

                    System.out.println("Dame los valores: (producto, cantidad y precio)");
                    String product = sc.nextLine();
                    int quantity = sc.nextInt();
                    sc.nextLine();
                    double price = sc.nextDouble();

                    reader = new BufferedReader(new FileReader(file));
                    String oldContent = "";

                    String line = reader.readLine();
                    while (line != null) {
                        oldContent += line + System.lineSeparator();
                        line = reader.readLine();
                    }

                    fw = new FileWriter(file);
                    fw.append(oldContent);
                    fw.append(product + ", " + quantity + ", " + price + "\n");
                    fw.close();

                } else if (decision == 2) {
                    
                    Scanner sc1 = new Scanner(file);
                    while (sc1.hasNextLine()) {
                        String s = sc1.nextLine();
                        System.out.println(s);
                    }
                    sc1.close();
                } else if (decision == 3) {

                    String oldContent = "";
                    System.out.println("Dame el producto que quieres reemplazar");
                    String toDelete = sc.nextLine();
                    System.out.println("Dame el reepmlaza:");
                    String replacement = sc.nextLine();

                    reader = new BufferedReader(new FileReader(file));

                    String line = reader.readLine();
                    while (line != null) {
                        oldContent += line + System.lineSeparator();
                        line= reader.readLine();
                    }
                    String newContent = oldContent.replaceAll(toDelete, replacement);

                    fw = new FileWriter(file);
                    fw.append(newContent);
                    fw.close();

                } else if (decision == 4) {
                    
                    String oldContent = "";
                    System.out.println("Dame el producto que quieres eliminar");
                    String toDelete = sc.nextLine();

                    reader = new BufferedReader(new FileReader(file));

                    String line = reader.readLine();
                    while (line != null) {
                        oldContent += line + System.lineSeparator();
                        line = reader.readLine();
                    }

                    fw = new FileWriter(file);
                    
                    String newContent = oldContent.replaceAll(toDelete + ",\s\\d+,\s\\d+", "");
                    fw.append(newContent);

                    reader.close();
                    fw.close();
                }

            }

        } catch (Exception e) {
            System.out.println("Error" + e);
            e.printStackTrace(System.out);
        } finally {
            System.out.println("Programa terminado");
        }

    }

}
