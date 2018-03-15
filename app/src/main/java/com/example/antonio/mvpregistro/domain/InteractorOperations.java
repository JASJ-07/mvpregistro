package com.example.antonio.mvpregistro.domain;


import java.util.Calendar;

/**
 * Created by antonio on 11/03/18.
 */

public class InteractorOperations implements IInteractorOperations{

    Calendar fecha = Calendar.getInstance();
    int year = fecha.get(Calendar.YEAR);



    @Override
    public String Nombre(String nombre) {
        return nombre;
    }

    @Override
    public String Apellido(String apellido) {
        return apellido;
    }



    @Override
    public int Fecha(int edad) {
        return year - edad;
    }
}
