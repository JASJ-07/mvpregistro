package com.example.antonio.mvpregistro.views.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import com.example.antonio.mvpregistro.R;
import com.example.antonio.mvpregistro.views.presenters.Ipresenter;
import com.example.antonio.mvpregistro.views.presenters.presenter;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
//import java.util.Calendar;
import butterknife.BindView;
import butterknife.OnClick;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements Iview{
    @BindView(R.id.txtnombre)
    EditText txtnombre;

    @BindView(R.id.txtapellido)
    EditText txtapellido;

    @BindView(R.id.btnregistrar)
    Button btnregistar;

    @BindView(R.id.datePicker)
    DatePicker datePicker;

    private Ipresenter presenter;

    Calendar fecha = Calendar.getInstance();
    int dia =fecha.get(Calendar.DAY_OF_MONTH);
    //int year = fecha.get(Calendar.YEAR);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        presenter = new presenter(this);
    }



    @Override
    public void mostrarLoading() {
        //progress mostrar
        Log.i("MainActivity", "Mostrando Loading");
    }

    @Override
    public void ocultarLoading() {
        //progress ocultar
        Log.i("MainActivity", "Ocultando Loading");
    }

    @OnClick(R.id.btnregistrar)
    public void onClickRegistrar() {
        Log.i("MainActivity", "boton presionado");
        String nombre = txtnombre.getText().toString();
        presenter.Nombre(nombre);

        String apellido = txtapellido.getText().toString();
        presenter.Apellido(apellido);

        int edad1 = datePicker.getYear();
        presenter.Date(edad1);

        }

    @Override
    public void mostrarError(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void MostrarNombre(String nombre) {
        Toast.makeText(this, "El monbre : " + nombre, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void MostrarApellido(String apellido) {
        Toast.makeText(this, "El Apellido : " + apellido, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void mostrarResultadoedad(int edad) {
        Toast.makeText(this, "La edad es : " + edad, Toast.LENGTH_SHORT).show();
    }
}
