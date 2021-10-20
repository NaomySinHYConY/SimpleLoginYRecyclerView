package com.example.examen1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterData extends RecyclerView.Adapter<AdapterData.ViewHolderDatos> {
    ArrayList<empleado> lista;

    public AdapterData(ArrayList<empleado> lista){
        this.lista = lista;
    }

    @NonNull
    @Override
    public ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item, null, false);
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderDatos holder, @SuppressLint("RecyclerView") int position) {
        empleado E = lista.get(position);
        holder.asignarDato(E);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(holder.itemView.getContext(), detalles.class);
                i.putExtra("nombre", E.nombre);
                i.putExtra("paterno", E.paterno);
                i.putExtra("materno", E.materno);
                i.putExtra("sexo", E.sexo);
                i.putExtra("edad", ""+E.edad);
                i.putExtra("puesto", E.puesto);
                i.putExtra("correo", E.correo);
                i.putExtra("password", E.password);
                i.putExtra("foto", ""+E.foto);
                holder.itemView.getContext().startActivity(i);
//                Toast.makeText(holder.itemView.getContext(), ""+position, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {
        TextView textNombre, textPuesto, textEdad;
        ImageView img;
        public ViewHolderDatos(@NonNull View itemView) {
            super(itemView);

            textNombre = itemView.findViewById(R.id.textNombre);
            textPuesto = itemView.findViewById(R.id.textPuesto);
            textEdad = itemView.findViewById(R.id.textEdad);

            img = itemView.findViewById(R.id.imageViewFoto);
        }

        public void asignarDato(empleado user) {
            textNombre.setText("Nombre: "+user.nombre+" "+user.paterno+" "+user.materno);
            textPuesto.setText("Puesto: "+user.puesto);
            textEdad.setText("Edad: "+user.edad);

            img.setImageResource(user.foto);
        }
    }
}
