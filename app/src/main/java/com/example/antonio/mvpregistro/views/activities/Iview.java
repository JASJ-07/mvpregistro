package com.example.antonio.mvpregistro.views.activities;

import java.util.Date;

/**
 * Created by antonio on 11/03/18.
 */

public interface Iview {

    void mostrarLoading();

    void ocultarLoading();

    void onClickRegistrar();

    void mostrarError(String msg);

    void MostrarNombre(String nombre);

    void MostrarApellido(String apellido);

    void mostrarResultadoedad(int edad);
}
