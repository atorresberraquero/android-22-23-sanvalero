package com.example.skill5;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolderDatos> {
 ArrayList<String> listDatos;

    public Adapter(ArrayList<String> listDatos) {
        this.listDatos = listDatos;
    }

    @NonNull
    @Override
    public Adapter.ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
     View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,null,false
     );
        return null;

    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolderDatos holder, int position) {
    holder.asignarDatos(listDatos.get(position));
    }

    @Override
    public int getItemCount() {
        return listDatos.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {
        TextView dato;
        public ViewHolderDatos(@NonNull View itemView) {
            super(itemView);
            dato=itemView.findViewById(R.id.idDato);        }

        public void asignarDatos(String datos) {
            dato.setText(datos);
        }
    }
}

