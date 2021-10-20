package com.example.examen1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText user, pass;
    Button iniciar;
    ArrayList<String> usuariosR;
    ArrayList<String> passR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.user);
        pass = findViewById(R.id.pass);
        iniciar = findViewById(R.id.iniciar);
        usuariosR = new ArrayList<>();
        passR = new ArrayList<>();

        usuariosR.add("Administrador");
        usuariosR.add("Super");

        passR.add("BUAP23");
        passR.add("456");


        iniciar.setOnClickListener(view -> {

            String U = user.getText().toString();
            String P = pass.getText().toString();

            int index = usuariosR.indexOf(U);
            //Toast.makeText(MainActivity.this, ""+index, Toast.LENGTH_SHORT).show();
            if(index != -1 && P.equals(passR.get(index))){
                //Toast.makeText(MainActivity.this, "Se logra", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this, recyclerView.class);
                i.putExtra("usuario", U);
                startActivity(i);
            }
            else{
                user.setText("");
                pass.setText("");
                Toast.makeText(MainActivity.this, "Error de inicio", Toast.LENGTH_SHORT).show();
            }
        });
    }
}