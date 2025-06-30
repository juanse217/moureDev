package com.sebasmoure.moureLogic;

public class Enumeraciones {

    public static void main(String[] args) {
        ejercicio();
        extra();
    }

    /*
     * EJERCICIO:
     * Empleando tu lenguaje, explora la definición del tipo de dato
     * que sirva para definir enumeraciones (Enum).
     * Crea un Enum que represente los días de la semana del lunes
     * al domingo, en ese orden. Con ese enumerado, crea una operación
     * que muestre el nombre del día de la semana dependiendo del número entero
     * utilizado (del 1 al 7).
     */

    private enum Dias {
        LUNES,
        MARTES,
        MIERCOLES,
        JUEVES,
        VIERNES,
        SABADO,
        DOMINGO,
        ERROR;

        public String getDay() {
            switch (this) {
                case LUNES:
                    return "Lunes";
                case MARTES:
                    return "Martes";
                case MIERCOLES:
                    return "Miercoles";
                case JUEVES:
                    return "Jueves";
                case VIERNES:
                    return "Viernes";
                case SABADO:
                    return "Sabado";
                case DOMINGO:
                    return "Domingo";
                default:
                    return "nothing";

            }

        }
    }

    private static void ejercicio() {
        int numDia = 3;
        Dias dia = switch (numDia) {
            case 1 -> Dias.LUNES;
            case 2 -> Dias.MARTES;
            case 3 -> Dias.MIERCOLES;
            case 4 -> Dias.JUEVES;
            case 5 -> Dias.VIERNES;
            case 6 -> Dias.SABADO;
            case 7 -> Dias.DOMINGO;
            default -> {
                System.out.println("error");
                yield Dias.ERROR;
            }
        };

        System.out.println(dia);

        Dias dia1 = Dias.LUNES;
        System.out.println(dia1.getDay());
    }

    /*
     * DIFICULTAD EXTRA (opcional):
     * Crea un pequeño sistema de gestión del estado de pedidos.
     * Implementa una clase que defina un pedido con las siguientes características:
     * - El pedido tiene un identificador y un estado.
     * - El estado es un Enum con estos valores: PENDIENTE, ENVIADO, ENTREGADO y
     * CANCELADO.
     * - Implementa las funciones que sirvan para modificar el estado:
     * - Pedido enviado
     * - Pedido cancelado
     * - Pedido entregado
     * (Establece una lógica, por ejemplo, no se puede entregar si no se ha enviado,
     * etc...)
     * - Implementa una función para mostrar un texto descriptivo según el estado
     * actual.
     * - Crea diferentes pedidos y muestra cómo se interactúa con ellos.
     */
    private static void extra() {
        Order order = new Order();
        order.shipProduct();
        System.out.println(order.checkStatus());
        order.delivered();
        System.out.println(order.checkStatus());
        order.cancel();
        System.out.println(order.status);

    }
}

    enum Status{
        PENDING,
        SHIPPED,
        DELIVERED,
        CANCELED
    }

    class Order{

        public static int id = 1;
        public Status status;
        
        public Order(){
            id++;
            status = Status.PENDING;
        }

        public void shipProduct(){
            if(status == Status.PENDING) status = Status.SHIPPED;
            
        }

        public void delivered(){
            if(status == Status.SHIPPED) status = Status.DELIVERED;
        }

        public void cancel(){
            if(status != Status.DELIVERED) status = Status.CANCELED;
            if(status == Status.DELIVERED) System.out.println("No se puede cancelar");
        }

        public Status checkStatus(){
            return status; 
        }


    }
