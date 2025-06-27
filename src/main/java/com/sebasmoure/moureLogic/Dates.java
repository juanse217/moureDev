package com.sebasmoure.moureLogic;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Dates {
    /*
     * Crea dos variables utilizando los objetos fecha (date, o semejante) de tu
     * lenguaje:
     * - Una primera que represente la fecha (día, mes, año, hora, minuto, segundo)
     * actual.
     * - Una segunda que represente tu fecha de nacimiento (te puedes inventar la
     * hora).
     * Calcula cuántos años han transcurrido entre ambas fechas.
     */
    public static void main(String[] args) {

        // Nos da el current date
        Date currentDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        String strDate = formatter.format(currentDate);
        System.out.println(strDate);

        // date de nacimiento
        Calendar calendar = Calendar.getInstance();
        calendar.set(2004, 9, 8, 5, 20, 10);
        Date birthDay = calendar.getTime();
        String birthDayFormatted = formatter.format(birthDay);
        System.out.println(birthDayFormatted);

        long age = currentDate.getTime() - birthDay.getTime(); // restamos sus milisegundos
        int edad = (int) (age / 3.154e+10);// milisegundos en un año
        System.out.println(edad);

    }
}
