package com.example.bernheimpp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterUsuarios extends RecyclerView.Adapter<UsuarioVH> {

    static List<UsuarioModel> usuarios;
    Activity a;

    public AdapterUsuarios(){

    }

    public AdapterUsuarios(List<UsuarioModel> usuarios, Activity a){
        AdapterUsuarios.usuarios = usuarios;
        this.a = a;
    }

    @NonNull
    @Override
    public UsuarioVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.usuario, parent, false);

        return new UsuarioVH(v, this.a);
    }

    @Override
    public void onBindViewHolder(@NonNull UsuarioVH holder, int position) {


        holder.tvNombre.setText(AdapterUsuarios.usuarios.get(position).getNombre());
        holder.tvContrasenia.setText(AdapterUsuarios.usuarios.get(position).getContrasenia());
        holder.tvTipoUsuario.setText(AdapterUsuarios.usuarios.get(position).getTipoUsuario());
        holder.btnUsuario.setOnClickListener(holder);

    }

    @Override
    public int getItemCount() {
        return this.usuarios.size();
    }


    public void ActualizarItem(Integer indice, UsuarioModel usuario){
        AdapterUsuarios.usuarios.set(indice, usuario);
    }
}
