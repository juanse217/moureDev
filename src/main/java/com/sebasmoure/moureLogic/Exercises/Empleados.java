package com.sebasmoure.moureLogic.Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Empleados {
    /*
     * DIFICULTAD EXTRA (opcional):
     * Implementa la jerarquía de una empresa de desarrollo formada por Empleados
     * que
     * pueden ser Gerentes, Gerentes de Proyectos o Programadores.
     * Cada empleado tiene un identificador y un nombre.
     * Dependiendo de su labor, tienen propiedades y funciones exclusivas de su
     * actividad, y almacenan los empleados a su cargo.
     */

    private int id; 
    private String name; 
    private List<Empleados> empleados;

    public Empleados(){

    }

    public Empleados(int id, String name){
        this.id = id; 
        this.name = name; 
    }

    public void trabajar(){
        System.out.println("soy un empleado y estoy trabajando");
    }

    public void addEmpleados(Empleados empleado){
        this.empleados.add(empleado);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public List<Empleados> getEmpleados() {
        return empleados;
    }
}

class Programador extends Empleados{
    public Programador(String name, int id){
        super(id, name);
    }

    @Override
    public void trabajar(){
        System.out.println("Soy un programador y estoy programando.");
    }

   public void programar(){
        System.out.println("Pipu pipu programo uuuuu");
   }

   @Override
   public void addEmpleados(Empleados empleado) {
       System.out.println("El programador no tiene nadie a cargo");
   }
}

class GerenteProyecto extends Empleados{
    public GerenteProyecto(String name, int id){
        super(id, name);
    }

    @Override
    public void trabajar(){
        System.out.println("Soy un gerente y estoy gerenciando");
    }

    public void gerenciarProyecto(){
        System.out.println("cambiar algo");
    }
}

class Gerente extends Empleados{
    public Gerente(String name, int id){
        super(id, name);
    }

    @Override
    public void trabajar(){
        System.out.println("Soy un gerente y estoy gerenciando");
    }

    public void gerenciarProyecto(){
        System.out.println("cambiar algo de la empresa");
    }
}

class master{
    public static void main(String[] args) {
        Programador programador = new Programador("Juan1", 0);
        GerenteProyecto gerenteProyecto = new GerenteProyecto("Juan2", 1);
        Gerente gerente = new Gerente("Juan3", 2);

        programador.addEmpleados(new Empleados(10, "Juanito"));
        gerenteProyecto.addEmpleados(new Empleados(12, "Juuuuu"));
        gerente.addEmpleados(gerenteProyecto);

        programador.trabajar();
        programador.programar();
        gerenteProyecto.trabajar();
        gerenteProyecto.gerenciarProyecto();
        gerente.trabajar();
        gerente.gerenciarProyecto();

        System.out.println(programador.getEmpleados().get(0).getName());
        System.out.println(gerenteProyecto.getEmpleados().get(0).getName());
        System.out.println(gerente.getEmpleados().get(1).getName());

    }
}