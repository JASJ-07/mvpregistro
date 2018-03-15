package com.example.antonio.mvpregistro.views.presenters;

import android.provider.ContactsContract;

import com.example.antonio.mvpregistro.domain.IInteractorOperations;
import com.example.antonio.mvpregistro.domain.InteractorOperations;
import com.example.antonio.mvpregistro.views.activities.Iview;


/**
 * Created by antonio on 11/03/18.
 */

public class presenter implements Ipresenter {

    private Iview view;
    private IInteractorOperations operations;

    public presenter(Iview view) {
        this.view = view;

        operations = new InteractorOperations();
    }

    @Override
    public void Nombre(String nombre) {
        try {
            view.mostrarLoading();
            nombre = operations.Nombre(nombre);
            view.ocultarLoading();
            view.MostrarNombre(nombre);
        } catch (Exception e) {
            view.mostrarError(e.getMessage());
        }
    }

    @Override
    public void Apellido(String apellido) {
        try {
            view.mostrarLoading();
            apellido = operations.Apellido(apellido);
            view.ocultarLoading();
            view.MostrarApellido(apellido);
        } catch (Exception e) {
            view.mostrarError(e.getMessage());
        }

    }

    @Override
    public void Date(int edad) {
        try {
            view.mostrarLoading();
            int day = operations.Fecha(edad);
            view.ocultarLoading();
            view.mostrarResultadoedad(day);
        }catch (Exception e){
            view.mostrarError(e.getMessage());
        }
    }
}
