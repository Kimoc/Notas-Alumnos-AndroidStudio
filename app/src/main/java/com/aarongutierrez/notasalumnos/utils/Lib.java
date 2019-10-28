package com.aarongutierrez.notasalumnos.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Lib {

    public static int calcularEdad(String fechaNacimiento){
     Date fechaNac=null;
     try{
         fechaNac= new SimpleDateFormat("yyyy/mm/dd").parse(fechaNacimiento);
     }catch (Exception ex){
         System.out.println(ex);
     }
        Calendar fechaNacimientoCalendar=Calendar.getInstance();
        Calendar fechaActual= Calendar.getInstance();
        fechaNacimientoCalendar(fechaNac);
        int año= fechaActual.get(Calendar.YEAR)- fechaNacimiento1


    }
}
