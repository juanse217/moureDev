package com.sebasmoure.moureLogic;

import java.util.LinkedList;

public class Conjuntos {

    public static void main(String[] args) {
        // ejercicio:
        // ejercicio();
        // extra:
        extra();
    }

    /*
     * EJERCICIO:
     * Utilizando tu lenguaje crea un conjunto de datos y realiza las siguientes
     * operaciones (debes utilizar una estructura que las soporte):
     * - Añade un elemento al final. ---
     * - Añade un elemento al principio.
     * - Añade varios elementos en bloque al final.
     * - Añade varios elementos en bloque en una posición concreta.
     * - Elimina un elemento en una posición concreta.
     * - Actualiza el valor de un elemento en una posición concreta.
     * - Comprueba si un elemento está en un conjunto.
     * - Elimina todo el contenido del conjunto.
     */
    private static void ejercicio() {

        // Creacion y carga de lista:
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        // elemento al final
        list.add(list.size(), 10);

        // elemento al principio
        list.add(0, 11);

        // bloque al final
        LinkedList<Integer> list1 = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            list1.add(i);
        }

        list.addAll(list1);

        // bloque en una posicion concreta

        list.addAll(5, list1);

        // eliminar elemento en una posicion concreta
        list.remove(0);

        // actualizar elemento en una posicion concreta
        list.add(2, 99);

        // comprobar si un elemento esta
        System.out.println(list.contains(99));

        System.out.println(list);

        // eliminar todo
        list.clear();
        System.out.println(list);

    }

    /*
     * * DIFICULTAD EXTRA (opcional):
     * Muestra ejemplos de las siguientes operaciones con conjuntos:
     * - Unión.
     * - Intersección.
     * - Diferencia.
     * - Diferencia simétrica.
     */
    private static void extra() {
        // Creacion y carga de lista:
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);

        // Creacion y carga de lista:
        LinkedList<Integer> list1 = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            list1.add(i);
        }
        System.out.println(list1);

        // union
        LinkedList<Integer> union = new LinkedList<>();
        union.addAll(list);
        union.addAll(list1);

        System.out.println(union);

        // Interseccion, elementos comunes
        LinkedList<Integer> interseccion = new LinkedList<>();

        int len = list.size() > list1.size() ? list.size() : list1.size();

        for (int i = 0; i < len; i++) {
            if (list1.contains(list.get(i))) {
                interseccion.add(list.get(i));
            }
        }

        System.out.println(interseccion);

        // Diferencia, elementos en list que no esten en list1
        LinkedList<Integer> diferencia = new LinkedList<>(list);

        diferencia.removeAll(list1);
        /*for (int i = 0; i < len; i++) {
            if (!list1.contains(list.get(i))) {
                diferencia.add(list.get(i));
            }
        }*/

        System.out.println(diferencia);

        // Diferencia simetrica
        LinkedList<Integer> simetrica = new LinkedList<>();

        for (int i = 0; i < len; i++) {
            if (!list1.contains(list.get(i)) || list.contains(list.get(i))) {
                simetrica.add(list.get(i));
            }
        }

        System.out.println(simetrica);

    }

    /*
     * static void extra() {
     * Set<String> conjuntoA = new LinkedHashSet<>(List.of("A", "B", "C", "D"));
     * System.out.println("Conjunto A: " + conjuntoA);
     * 
     * Set<String> conjuntoB = new LinkedHashSet<>(List.of("C", "D", "E", "F"));
     * System.out.println("Conjunto B: " + conjuntoB);
     * 
     * // Unión
     * Set<String> union = new LinkedHashSet<>(conjuntoA);
     * union.addAll(conjuntoB);
     * System.out.println("Unión: " + union);
     * 
     * // Intersección
     * Set<String> interseccion = new LinkedHashSet<>(conjuntoA);
     * interseccion.retainAll(conjuntoB);
     * System.out.println("Intersección: " + interseccion);
     * 
     * // Diferencia (A - B)
     * Set<String> diferenciaAB = new LinkedHashSet<>(conjuntoA);
     * diferenciaAB.removeAll(conjuntoB);
     * System.out.println("Diferencia (A - B): " + diferenciaAB);
     * 
     * // Diferencia simétrica (A Δ B)
     * Set<String> diferenciaSimetrica = new LinkedHashSet<>(conjuntoA);
     * diferenciaSimetrica.addAll(conjuntoB);
     * Set<String> interseccionRemoval = new LinkedHashSet<>(conjuntoA);
     * interseccionRemoval.removeAll(conjuntoB);
     * diferenciaSimetrica.removeAll(interseccionRemoval);
     * System.out.println("Diferencia simétrica (A Δ B): " + diferenciaSimetrica);
     * }
     */
}
