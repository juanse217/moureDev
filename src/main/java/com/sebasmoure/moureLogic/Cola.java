package com.sebasmoure.moureLogic;

import java.util.ArrayList;

public class Cola<T> {
    /*
     * DIFICULTAD EXTRA (opcional):
     * Implementa dos clases que representen las estructuras de Pila y Cola
     * (estudiadas
     * en el ejercicio número 7 de la ruta de estudio)
     * - Deben poder inicializarse y disponer de operaciones para añadir, eliminar,
     * retornar el número de elementos e imprimir todo su contenido.
     */
    private ArrayList<T> queue = new ArrayList<>();
    private int len = 0;

    public T pop() {
        T ret = queue.get(0);
        queue.remove(0);
        len -= 1;
        return ret;
    }

    public void push(T value) {
        queue.add(value);
        len += 1;
    }

    public int size() {
        return queue.size();
    }

    public void printElements() {

        for (T i : queue) {
            System.out.print(i);
        }
    }

    public static void main(String[] args) {
        Cola<Integer> cola = new Cola<>();
        cola.push(1);
        cola.push(2);
        cola.push(3);
        cola.printElements();
        System.out.println(cola.pop());
        System.out.println(cola.pop());
        System.out.println(cola.pop());
    }

}
