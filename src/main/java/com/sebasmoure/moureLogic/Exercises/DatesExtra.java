package com.sebasmoure.moureLogic.Exercises;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class DatesExtra {
    /*
     * DIFICULTAD EXTRA (opcional):
     * Utilizando la fecha de tu cumpleaños, formatéala y muestra su resultado de
     * 10 maneras diferentes. Por ejemplo:
     * - Día, mes y año.
     * - Hora, minuto y segundo.
     * - Día de año.
     * - Día de la semana.
     * - Nombre del mes.
     * (lo que se te ocurra...)
     */
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2004, 12, 9, 3, 9);
        Date date = calendar.getTime();
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm YY/MM/dd");
        System.out.println(formatter.format(date));

        LocalDate date1 = LocalDate.of(2004, 9, 8);
        System.out.println(date1.getDayOfYear());
        System.out.println(date1.getDayOfMonth());
        System.out.println(date1.getDayOfWeek());
        System.out.println(date1.getMonthValue());
        
    }
}
