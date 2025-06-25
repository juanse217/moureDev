package com.sebasmoure.moureLogic;

public class Recursive {
    private static final int  VALUE = 100; 
    public static void main(String[] args) {
       recursive(VALUE);
    }

    

    private static int recursive(int n){
        if(n < 0){
            return 0;
        }
        System.out.println(n);
        return recursive(n-1);
    }
}
