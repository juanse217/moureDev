package com.sebasmoure.moureLogic;


public class AreaPoligono {

    public static void main(String[] args) {
        
        Triangulo t = new Triangulo(5, 2);
        Cuadrado c = new Cuadrado(4);
        Rectangulo r = new Rectangulo(5, 3);
        System.out.println(calcularArea(t));
        System.out.println(calcularArea(c));
        System.out.println(calcularArea(r));
    }

    private static double calcularArea(Poligono poligono){
        return poligono.calcArea();
    }
}


interface Poligono{

    public abstract double calcArea();
}

class Cuadrado implements Poligono{
    private double lado;

    public Cuadrado(double lado){
        this.lado = lado;
    }


    public double calcArea(){
        return lado * lado;
    }
}

class Triangulo implements Poligono{
    private double base;
    private double altura;

    public Triangulo(double base, double altura){
        this.altura = altura;
        this.base = base;
    }

    public double calcArea(){
        return (base * altura) / 2;
    }
}

class Rectangulo implements Poligono{
    private double alto;
    private double ancho;

    public Rectangulo(double alto, double ancho){
        this.alto = alto;
        this.ancho = ancho;
    }

    public double calcArea(){
        return alto * ancho;
    }
}

