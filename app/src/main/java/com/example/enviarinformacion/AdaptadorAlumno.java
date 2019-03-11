package com.example.enviarinformacion;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.enviarinformacion.modelo.Alumno;

import java.util.List;

public class AdaptadorAlumno extends RecyclerView.Adapter<AdaptadorAlumno.ViewHolder> {

    List<Alumno> alumnos;

    public  AdaptadorAlumno(List<Alumno> a){//Devuelve un viewholder(un renglon)
        this.alumnos = a;
    }

    @NonNull
    @Override
    public AdaptadorAlumno.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.itemr, viewGroup, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorAlumno.ViewHolder viewHolder, int i) {

        Alumno a = alumnos.get(i);
        viewHolder.txtNombre.setText(alumnos.get(i).getNombre());
    }

    @Override
    public int getItemCount() { return alumnos.size();}

    public  class  ViewHolder extends  RecyclerView.ViewHolder{

        TextView txtNombre;

        public ViewHolder(View itemView)
        {
            super(itemView);

            txtNombre = itemView.findViewById(R.id.txtNombre);

        }
    }
}
