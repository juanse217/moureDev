package com.sebasmoure.moureLogic;

public abstract class Animal {
    /*
     * EJERCICIO:
     * Explora el concepto de herencia según tu lenguaje. Crea un ejemplo que
     * implemente una superclase Animal y un par de subclases Perro y Gato,
     * junto con una función que sirva para imprimir el sonido que emite cada
     * Animal.
     */

    public String animalType;
    public int numberOfFeet; 

    public Animal(String animalType, int numberOfFeet){
        this.animalType = animalType;
        this.numberOfFeet = numberOfFeet;
    }
    
    public abstract void makeSound();
}

class Perro extends Animal{
    public Perro(String type, int feet){
        super(type, feet);
    }

    public void makeSound(){
        System.out.println("Woof");
    }
}

class Gato extends Animal{
    public Gato(String type, int feet){
        super(type, feet);
    }

    public void makeSound(){
        System.out.println("Miau");
    }

}

class Hola{
    public static void main(String[] args) {
        Perro perro = new Perro("Perro", 4);
        Gato gato = new Gato("Gato", 4);
        System.out.println(perro.animalType + " " + perro.numberOfFeet);
        System.out.println(gato.animalType + " " + gato.numberOfFeet);
        

        perro.makeSound();
        gato.makeSound();
    }
}