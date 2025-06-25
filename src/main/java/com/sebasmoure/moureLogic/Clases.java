package com.sebasmoure.moureLogic;

public class Clases {
    // Clase vapo.

    /*
     * EJERCICIO:
     * Explora el concepto de clase y crea un ejemplo que implemente un
     * inicializador,
     * atributos y una función que los imprima (teniendo en cuenta las posibilidades
     * de tu lenguaje).
     * Una vez implementada, créala, establece sus parámetros, modifícalos e
     * imprímelos
     * utilizando su función.
     */

    private int bateria;
    private int puffs;
    private String marca;
    private String sabor;

    public Clases(String marca, String sabor) {
        this.marca = marca;
        this.sabor = sabor;
        bateria = 100;
        puffs = 100;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public void setPuffs(int puffs) {
        this.puffs = puffs;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public int getBateria() {
        return bateria;
    }

    public int getPuffs() {
        return puffs;
    }

    public String getMarca() {
        return marca;
    }

    public String getSabor() {
        return sabor;
    }

    public void vapear() {

        if (bateria <= 0 || puffs <= 0) {
            System.out.println("No queda bateria o puffs. ");
        }
        System.out.println("Vapeando");
        bateria -= 1;
        puffs -= 1;
    }

    public void imprimirParamentos() {
        System.out.println("Bateria " + bateria + " Puffs " + puffs + " Marca " + marca + " Sabor " + sabor);
    }

    public static void main(String[] args) {
        Clases clase = new Clases("Puffer", "Manzana");

        clase.vapear();
        System.out.println(clase.getBateria() + " " + clase.getPuffs());
        clase.imprimirParamentos();
    }
}
