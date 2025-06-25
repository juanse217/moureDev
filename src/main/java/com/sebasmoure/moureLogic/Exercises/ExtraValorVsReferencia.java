package com.sebasmoure.moureLogic.Exercises;

public class ExtraValorVsReferencia {
    public static void main(String[] args) {

        //POR VALOR
        int a = 1;
        int b = 2;
        //en java, al no poder devolver varios valores, debemos usar arrays u otras estructuras. 
        int[] arr = {a, b};
        exchangeValor(arr);
        //hacemos referencia al mismo array ya que como es un objeto, el cambio en el método se ve en el arr que se pasa porque se pasa la dirección en memoria

        a = arr[0];
        b = arr[1];
        System.out.println(a + " " + b);

        //POR REFERENCIA: 
        int[] arr1 = {10, 20};
        int[] arr2 = {30, 40};

         for (int i : arr1) {
            System.out.println(i);
        }
        for (int i : arr2) {
            System.out.println(i);
        }

        exchangeReferencia(arr1, arr2);
        for (int i : arr1) {
            System.out.println(i);
        }
        for (int i : arr2) {
            System.out.println(i);
        }
        
    }

    private static void exchangeReferencia(int[] a, int[] b){
        int tem1 = a[0];
        int tem2  = a[1]; 
        a[0] = b[0];
        a[1] = b[1];
        b[0] = tem1;
        b[1] = tem2; 
    }

    private static int[] exchangeValor(int[] arr){
        int temp = arr[0]; 
        arr[0] = arr[1];
        arr[1] = temp;
        return arr;

        
    }
}
