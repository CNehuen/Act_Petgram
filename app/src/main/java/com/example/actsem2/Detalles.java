package com.example.actsem2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Detalles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);

        Bundle parametros = getIntent().getExtras();
        String nombre = parametros.getString("Nombre");
        //String fecha = parametros.getString("Fecha");
        String telefono = parametros.getString("Telefono");
        String mail = parametros.getString("Email");
        String descripcion = parametros.getString("Descripcion");

        TextView lblNombre = (TextView) findViewById(R.id.lblNombre);
        //TextView lblFecha = (TextView) findViewById(R.id.lblFecha);
        TextView lblTelefono = (TextView) findViewById(R.id.lblTelefono);
        TextView lblMail = (TextView) findViewById(R.id.lblMail);
        TextView lblDescripcion = (TextView) findViewById(R.id.lblDescripcion);

        lblNombre.setText(nombre);
        //lblFecha.setText("Fecha de nacimiento: " +fecha);
        lblTelefono.setText("Telefono: " + telefono);
        lblMail.setText("Email: "+mail);
        lblDescripcion.setText("Descripcion: " +descripcion);

    }
}