package com.sebasmoure.moureLogic.Exercises;

public class ValorVsReferencia {
    /**
     * una variable pasada por valor es a la que le pasamos el un valor el cual es almacenado en memoria, pero cuando se pasa esta variable a un método o a otra variable, esta no cambia ya que se pasa una copia que se guardo en un nuevo espacio de memoria.
     * 
     * Cuando usamos paso por reeferencia, normalmente hablamos de objetos. Su valor es guardado en un espacio de memoria al cual la variable guarda su dirección. Cuando asignamos o pasamos la variable a un método o a otra variable, lo que hacemos es tener dos variables apuntando a un mismo espacio de memoria, por lo tanto los cambios afectan a ambas variables. 
     * EXCEPCIÓN: Los objetos inmutables, como los strings, cuando se modifica, se crea una copia del objeto. 
     * 
     * @param args
     */
    public static void main(String[] args) {
        //valor: 
        int n = 1;
        int j = 4;
        valor(n, j);
        System.out.println(n + " " + j);
        //no cambian los valores porque a pesar de que se pasaron y fueron modificados, se pasa una copia del valor y se asigna a un nuevo espacio de memoria. 

        //Referencia: 
        int[] arr = {0, 1, 2, 3};
        referencia(arr);
        for (int i : arr) {
            System.out.print(i + ", ");
        }

        //Los valores de nuestro array cambian por que java pasa la dirección de memoria del objeto, no una copia del objeto por lo que sus valores cambian cuando se llama al método. 
        System.out.println();
        //Usando clases: 
        Carro car = new Carro(19000, "Chevrolet", "Verde");
        classChange(car);
        System.out.println(car.getCosto() + " " + car.getMarca() + " " + car.getColor());
        //como nuestra clase es un objeto, cuando se lo pasamos a nuestro método, este modifica los valores de nuestro carro.
    }

    private  static void valor(int n, int j){
        n = 5; 
        j = 9;
        System.out.println(n + " " + j);
    }

    private static void referencia(int[] arr){
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 7; 
        arr[3] = 8;
    }

    private static void classChange(Carro carro){
        carro.setCosto(15000);
        carro.setMarca("CHery");
        carro.setColor("Rosado pomposo");
    }
}

class Carro{
    private double costo;
    private String marca; 
    private String color;

    Carro(){

    }

    Carro(double costo, String marca, String color){
        this.costo = costo; 
        this.marca = marca; 
        this.color = color; 
    }

    public double getCosto() {
        return costo;
    }
    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
