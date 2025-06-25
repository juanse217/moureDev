package com.sebasmoure.moureLogic.Exercises;

import java.util.ArrayList;

public class ExcepcionesExtra {
    /*
     * DIFICULTAD EXTRA (opcional):
     * Crea una función que sea capaz de procesar parámetros, pero que también
     * pueda lanzar 3 tipos diferentes de excepciones (una de ellas tiene que
     * corresponderse con un tipo de excepción creada por nosotros de manera
     * personalizada, y debe ser lanzada de manera manual) en caso de error.
     * - Captura todas las excepciones desde el lugar donde llamas a la función.
     * - Imprime el tipo de error.
     * - Imprime si no se ha producido ningún error.
     * - Imprime que la ejecución ha finalizado.
     */

     public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        excepciones(new int[]{0,1,2}, list);
     }

     private static void excepciones(int[] arr, ArrayList<Integer> list){
        try{
            System.out.println(arr[0]);
            System.out.println("No problems with array");
            System.out.println(list.get(0));
            System.out.println("no problems with list");
            System.out.println(10/1);

            System.out.println("No hubo errores");
        }catch(IndexOutOfBoundsException e){
            System.out.println("No existe esa pos en el array, debe ser menor a " + arr.length);
            throw e;
        }catch(NullPointerException e){
            System.out.println("Apuntando a un elemento nulo");
            throw e;
        }catch(ArithmeticException e){
            System.out.println("La operacion dada no es correcta");
            throw e;
        }finally{
            System.out.println("Programa terminado");
        }
     }
}
