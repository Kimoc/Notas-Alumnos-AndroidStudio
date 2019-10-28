package com.aarongutierrez.notasalumnos.model;

import java.util.HashMap;

public class Alumno {
    private int nia;
    private String nombre;
    private  String apellido1;
    private  String apellido2;
    private String fechaNacimiento;
    private int edad;
    private String email;
    private HashMap<String , Double>[] notasAlumno;

    public Alumno(int nia, String nombre, String apellido1, String apellido2, String fechaNacimiento, String email, HashMap<String, Double>[] notasAlumno) {
        this.nia = nia;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaNacimiento = fechaNacimiento;

        this.email = email;
        this.notasAlumno = notasAlumno;
    }
}
