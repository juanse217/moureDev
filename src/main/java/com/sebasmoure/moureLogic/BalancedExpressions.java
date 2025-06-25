package com.sebasmoure.moureLogic;

import java.util.HashMap;
import java.util.Stack;
import java.util.Map.Entry;

public class BalancedExpressions {
    public static void main(String[] args) {
        System.out.println(balancedExpression("{ [ a * ( c + d ) ] - 5 }"));
        System.out.println(balancedExpression("{ a * ( c + d ) ] - 5 }"));
        System.out.println(balancedExpression("{ a * ( c + d ) ] - 5 }}"));
        System.out.println(balancedExpression("{{{{{{(}}}}}}"));
    }
    /*
 * Crea un programa que comprueba si los paréntesis, llaves y corchetes
 * de una expresión están equilibrados.
 * - Equilibrado significa que estos delimitadores se abren y cieran
 *   en orden y de forma correcta.
 * - Paréntesis, llaves y corchetes son igual de prioritarios.
 *   No hay uno más importante que otro.
 * - Expresión balanceada: { [ a * ( c + d ) ] - 5 }
 * - Expresión no balanceada: { a * ( c + d ) ] - 5 }
 */

    private static boolean balancedExpression(String s){
        Stack<Character> stack = new Stack<>();

        //iterar por cada valor de s
        
        for (Character ch : s.toCharArray()) {

            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);

            }else if(ch == ')' || ch == ']' || ch == '}'){
                
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if((ch == ')' && top != '(') ||
                (ch == ']' && top != '[') ||
                (ch == '}' && top != '{')){
                    return false;
                }
            }
        }
    

        //System.out.println(map);
        return stack.isEmpty();
    }
}
