package com.example.bernheimpp;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class UsuarioController implements View.OnClickListener{

    Activity a;
    UsuarioModel usuario;
    UsuarioView view;

    public UsuarioController(UsuarioModel usuario, Activity a){
        this.usuario = usuario;
        this.a = a;
    }

    public void setView(UsuarioView view){
        this.view = view;
    }

    public void onClick(View v){
        this.view.cargarModelo();
    }

    public void setUsuario(UsuarioModel usuario, String edContrasenia2){

        if(usuario.getContrasenia().equals(edContrasenia2) && usuario.getNombre().length() >= 3){

            AdapterUsuarios aux = new AdapterUsuarios();
            aux.ActualizarItem(usuario.getIndice(), usuario);
            Intent returnIntent = new Intent();
            returnIntent.putExtra("indice", usuario.getIndice().toString());
            this.a.setResult(Activity.RESULT_OK, returnIntent);
            this.a.finish();

        }else{
            this.a.finish();
        }


    }
}
