package com.example.examen1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class detalles extends AppCompatActivity {

    Button volver;
    TextView txtNombre, txtPaterno, txtMaterno, txtSexo, txtPuesto, txtEdad, txtCorreo, txtPas;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);

        txtNombre = findViewById(R.id.txtNombre);
        txtPaterno = findViewById(R.id.txtPaterno);
        txtMaterno = findViewById(R.id.txtMaterno);
        txtSexo = findViewById(R.id.txtSexo);
        txtEdad = findViewById(R.id.txtEdad);
        txtCorreo = findViewById(R.id.txtCorreo);
        txtPuesto = findViewById(R.id.txtPuesto);
        txtPas = findViewById(R.id.txtPass);

        img = findViewById(R.id.foto);

        //Se asignan los valores
        String N = "Nombre: "+getIntent().getStringExtra("nombre");
        String P = "Apellido Paterno: "+getIntent().getStringExtra("paterno");
        String M = "Apellido Materno: "+getIntent().getStringExtra("materno");
        String S = "Sexo: "+getIntent().getStringExtra("sexo");
        String E = "Edad: "+getIntent().getStringExtra("edad");
        String C = "Correo: "+getIntent().getStringExtra("correo");
        String Pu = "Puesto: "+getIntent().getStringExtra("puesto");
        String Pa = "Password: "+getIntent().getStringExtra("password");

        String F = getIntent().getStringExtra("foto");

        txtNombre.setText(N);
        txtPaterno.setText(P);
        txtMaterno.setText(M);
        txtSexo.setText(S);
        txtEdad.setText(E);
        txtCorreo.setText(C);
        txtPuesto.setText(Pu);
        txtPas.setText(Pa);
        img.setImageResource(Integer.parseInt(F));

        volver = findViewById(R.id.volver);
        volver.setOnClickListener(view -> {
            Intent i = new Intent(detalles.this, recyclerView.class);
            startActivity(i);
        });
    }
}