package com.example.actsem2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void siguiente(View view){
        TextInputLayout nombre = findViewById(R.id.txnom);
        TextInputLayout telefono = findViewById(R.id.txtel);
        TextInputLayout email = findViewById(R.id.txmail);
        TextInputLayout descripcion = findViewById(R.id.txdescripcion);

        Intent intent = new Intent(this, Detalles.class);
        Bundle extras = new Bundle();
        //extras.putString("Nombre", findViewById(R.id.txtNombre).toString());
        //extras.putString("Telefono", findViewById(R.id.txtTelefono).toString());
        //extras.putString("Email", findViewById(R.id.txtMail).toString());
        //extras.putString("Descripcion", findViewById(R.id.txtDescripcion).toString());
        //intent.putExtras(extras);
        intent.putExtra("Nombre", nombre.getEditText().getText().toString());
        //intent.putExtra("Fecha", findViewById(R.id.datePicker1).toString());
        intent.putExtra("Telefono", telefono.getEditText().getText().toString());
        intent.putExtra("Email", email.getEditText().getText().toString());
        intent.putExtra("Descripcion", descripcion.getEditText().getText().toString());
        startActivity(intent);
    }
}