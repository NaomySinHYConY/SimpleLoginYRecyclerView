package com.example.examen1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class recyclerView extends AppCompatActivity {

    TextView bienvenida;
    Button salir;
    ArrayList<empleado> lista2;

    RecyclerView recyclerViewU;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        //lista = new ArrayList<String>();
        lista2 = new ArrayList<>();

        recyclerViewU = findViewById(R.id.recyclerViewU);

        bienvenida = findViewById(R.id.bienvenida);
        String U = getIntent().getStringExtra("usuario");
        String user = "Bienvenido, "+ U;

        bienvenida.setText(user);

        lista2.add(new empleado("Sofia", "Francis", "Funes", "M", 30, "Diseñador", "sofia.francis.funes@gmail.com", "69784", R.drawable.x1));
        lista2.add(new empleado("Luis", "Hernandez", "Rodriguez", "H", 28, "Programador master", "jose.luis.hernandez.rodriguez@gmail.com", "36937", R.drawable.x2));
        lista2.add(new empleado("Valentina", "Torres", "Valencia", "M", 25, "Programador Junior", "valentina.torres.valencia@gmail.com", "96332", R.drawable.x3));
        lista2.add(new empleado("Jose", "Gonzales", "Ruiz", "H", 25, "Analista", "jose.gonzalez.ruiz@gmail.com", "81126", R.drawable.x4));
        lista2.add(new empleado("Regina", "Navarro", "Saldaña", "M", 26, "Diseñador", "regina.navarro.saldaña@gmail.com", "68297", R.drawable.x5));
        lista2.add(new empleado("Manuel", "Salinas", "Bacab", "H", 27, "Programador Master", "manuel.salinas.bacab@gmail.com", "39423", R.drawable.x6));
        lista2.add(new empleado("Juan Carlos", "Setien", "Herrera", "H", 27, "Programador Junior", "juan.carlos.setien.herrera@gmail.com", "68795", R.drawable.x7));
        lista2.add(new empleado("Roberto", "Cruz", "Gonzales", "H", 26, "Analista", "roberto.cruz.gonzalez@gmail.com", "48462", R.drawable.x8));
        lista2.add(new empleado("Maria Jose", "Garcia", "Aldatz", "M", 28, "Diseñador", "maria.jose.garcia.aldatz@gmail.com", "68814", R.drawable.x9));
        lista2.add(new empleado("Ximena", "Gas", "Cervera", "M", 30, "Programador Master", "ximena.gas.cervera@gmail.com", "49674", R.drawable.x10));
        lista2.add(new empleado("Miguel Angel", "Gomez", "Garcia", "H", 29, "Programador Junior", "miguel.angel.gomez.garcia@gmail.com", "21186", R.drawable.x11));
        lista2.add(new empleado("Francisco", "Curiel", "Franco", "H", 25, "Analista", "jose.francisco.curiel.franco@gmail.com", "26513", R.drawable.x12));
        lista2.add(new empleado("Antonio", "Verduzco", "Saldaña", "H", 26, "Diseñador", "jesus.antonio.verduzco.saldaña@gmail.com", "64488", R.drawable.x13));
        lista2.add(new empleado("Alejandra", "Varela", "Gutierrez", "M", 27, "Programador Master", "alejandra.varela.gutierrez@gmail.com", "19477", R.drawable.x14));
        lista2.add(new empleado("Ricardo", "Rosas", "Melendez", "H", 28, "Programador Junior", "ricardo.rosas.melendez@gmail.com", "84698", R.drawable.x15));
        lista2.add(new empleado("Daniel", "Valdez", "Villa", "H", 29, "Analista", "daniel.valdes.villa@gmail.com", "82786", R.drawable.x16));
        lista2.add(new empleado("Jorge", "Venegas", "Acevedo", "H", 30, "Diseñador", "jorge.vanegas.acevedo@gmail.com", "19318", R.drawable.x17));
        lista2.add(new empleado("Camila", "Viveros", "Faucer", "M", 25, "Programador Master", "camila.viveros.fauser@gmail.com", "24112", R.drawable.x18));
        lista2.add(new empleado("Javier", "Aranda", "Barajas", "H", 26, "Programador Junior", "javier.aranda.barajas@gmail.com", "77328", R.drawable.x19));
        lista2.add(new empleado("Raul", "Espinosa", "Cisneros", "H", 27, "Analista", "raul.espinosa.cisneros@gmail.com", "45456", R.drawable.x20));
        lista2.add(new empleado("David", "Cabrera", "Llanos", "H", 28, "Diseñador", "david.cabrero.llanos@gmail.com", "94559", R.drawable.x21));
        lista2.add(new empleado("Maria", "Cordero", "Villalobos", "M", 29, "Programador Master", "maria.fernanda.cordero.villalobos@gmail.com", "79448", R.drawable.x22));
        lista2.add(new empleado("Alfredo", "Del rio", "Campos", "H", 25, "Programador Junior", "alfredo.del.rio.campos@gmail.com", "34649", R.drawable.x23));
        lista2.add(new empleado("Gabriel", "Leffmans", "Filizola", "M", 25, "Analista", "gabriel.leffmans.filizola@gmail.com", "42857", R.drawable.x24));
        lista2.add(new empleado("Valeria", "Maldonado", "Favela", "M", 27, "Diseñador", "valeria.maldonado.favela@gmail.com", "13279", R.drawable.x25));
        lista2.add(new empleado("Pablo", "Nemegyei", "Sandoval", "H", 26, "Programador Master", "pablo.nemegyei.sandoval@gmail.com", "15295", R.drawable.x26));
        lista2.add(new empleado("Ruben", "Martinez", "Parra", "H", 28, "Programador Junior", "ruben.martinez.parra@gmail.com", "63522", R.drawable.x27));
        lista2.add(new empleado("Diego", "Castañeda", "Cicero", "H", 28, "Analista", "diego.castañeda.cicero@gmail.com", "24579", R.drawable.x28));
        lista2.add(new empleado("Elena", "Angeles", "Arenas", "M", 29, "Diseñador", "elena.angeles.arenas@gmail.com", "92417", R.drawable.x29));
        lista2.add(new empleado("Roberto", "Castellanos", "Aburto", "H", 30, "Programador Master", "roberto.castellanos.aburto@gmail.com", "61187", R.drawable.x30));
        lista2.add(new empleado("Carlos", "Guitart", "Sanchez", "H", 25, "Programador Junior", "carlos.guitart.sanchez@gmail.com", "51816", R.drawable.x31));
        lista2.add(new empleado("Mariana", "Laguillo", "Padilla", "M", 27, "Analista", "mariana.laguillo.padilla@gmail.com", "89882", R.drawable.x32));
        lista2.add(new empleado("Manuel", "Gongora", "Rodriguez", "H", 26, "Diseñador", "juan.manuel.gongora.rodriguez@gmail.com", "69847", R.drawable.x33));
        lista2.add(new empleado("Santiago", "Herrera", "Blanchet", "H", 25, "Programador Master", "santiago.herrera.blanchet@gmail.com", "74454", R.drawable.x34));
        lista2.add(new empleado("Sebastian", "Garcia", "Garduño", "H", 30, "Programador Junior", "sebastian.garcia.garduño@gmail.com", "43174", R.drawable.x35));


        recyclerViewU.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        AdapterData ad = new AdapterData(lista2);
        recyclerViewU.setAdapter(ad);

        salir = findViewById(R.id.salir);
        salir.setOnClickListener(view -> {
            Intent i = new Intent(recyclerView.this, MainActivity.class);
            startActivity(i);
        });
    }
}