package com.example.bernheimpp;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class UsuarioVH extends RecyclerView.ViewHolder implements View.OnClickListener{

    TextView tvNombre;
    TextView tvContrasenia;
    TextView tvTipoUsuario;
    ImageButton btnUsuario;
    View item;
    Activity a;

    public UsuarioVH (View itemView, Activity a){
        super(itemView);
        this.tvNombre = itemView.findViewById(R.id.tvNombre);
        this.tvContrasenia = itemView.findViewById(R.id.tvContrasenia);
        this.tvTipoUsuario = itemView.findViewById(R.id.tvTipoUsuario);
        this.btnUsuario = itemView.findViewById(R.id.btnUsuario);
        this.item = itemView.findViewById(R.id.usuario);
        this.a = a;
    }

    public void onClick(View v){

        Intent i = new Intent(this.a, editActivity.class);
        i.putExtra("nombre", this.tvNombre.getText());
        i.putExtra("contrasenia", this.tvContrasenia.getText());
        i.putExtra("tipoUsuario", this.tvTipoUsuario.getText());
        i.putExtra("indice", this.getAdapterPosition());

        a.startActivityForResult(i, 1);

    }



}
