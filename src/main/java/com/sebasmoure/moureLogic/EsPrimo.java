package com.sebasmoure.moureLogic;

import java.awt.geom.Arc2D;

public class EsPrimo {
    public static void main(String[] args) {
        System.out.println(primo(17));
        System.out.println(primo(31));
        
    }

    private static boolean primo(Integer n){

        boolean b = true;

        if (n < 2)
            return false;

        for (int i = 2; i < n ; i++) {
           if (n%i==0){
               b = false;
               break;
           }
        }

        return b;
    }
}
