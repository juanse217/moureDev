package com.sebasmoure.moureLogic;

import java.util.ArrayList;

public class Pila<T> {
    /*
     * DIFICULTAD EXTRA (opcional):
     * Implementa dos clases que representen las estructuras de Pila y Cola
     * (estudiadas
     * en el ejercicio número 7 de la ruta de estudio)
     * - Deben poder inicializarse y disponer de operaciones para añadir, eliminar,
     * retornar el número de elementos e imprimir todo su contenido.
     */

    private ArrayList<T> stack = new ArrayList<>();
    private int len = 0;

    public T pop() {
        try {
            T ret = stack.get(len - 1);
            stack.remove(len - 1);
            len -= 1;
            return ret;
        } catch (Exception e) {
            throw e;
        }
    }

    public void push(T value) {
        stack.add(value);
        len += 1;
    }

    public T get(int i) {
        return stack.get(i);
    }

    public int size() {
        return stack.size();
    }

    public void printElements() {
        for (T t : stack) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        Pila<Integer> pila = new Pila<>();

        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.printElements();
        System.out.println(pila.pop());
        System.out.println(pila.pop());
        System.out.println(pila.pop());
    }

}
