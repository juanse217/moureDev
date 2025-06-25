package com.sebasmoure.moureLogic;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverser("Hola mundo"));
    }

    private static String reverser(String st){
        String ret = "";
        int l = st.length()-1;
        for (int i = l; i >= 0 ; i--) {
            ret += (st.charAt(i));
        }

        return ret;
    }

}
