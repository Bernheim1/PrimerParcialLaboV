package com.example.bernheimpp;

import android.app.Activity;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class UsuarioView {

    UsuarioModel usuario;
    Activity a;
    EditText edNombre;
    EditText edContrasenia;
    EditText edContrasenia2;
    RadioButton rbAdministrador;
    RadioButton rbUsuario;
    Button btn;
    UsuarioController controller;

    public UsuarioView(UsuarioModel usuario, Activity a, UsuarioController controller){

        this.usuario = usuario;
        this.a = a;
        this.controller = controller;

        if(this.edNombre == null){
            this.edNombre = this.a.findViewById(R.id.edNombre);
            this.edContrasenia = this.a.findViewById(R.id.edContrasenia);
            this.edContrasenia2 = this.a.findViewById(R.id.edContrasenia2);
            this.rbAdministrador = this.a.findViewById(R.id.radioAdministrador);
            this.rbUsuario = this.a.findViewById(R.id.radioUsuario);
            this.btn = this.a.findViewById(R.id.btnGuardar);
            btn.setOnClickListener(controller);
        }
    }

    public void cargarModelo(){

        String edContrasenia2;

        this.usuario.setNombre(edNombre.getText().toString());
        this.usuario.setContrasenia(edContrasenia.getText().toString());
        edContrasenia2 = this.edContrasenia2.getText().toString();

        if(this.rbAdministrador.isChecked()){
            this.usuario.setTipoUsuario("Administrador");
        }else{
            this.usuario.setTipoUsuario("Usuario");
        }

        this.controller.setUsuario(this.usuario, edContrasenia2);


    }

    public void mostrarModelo(){
        edNombre.setText(this.usuario.getNombre());
        edContrasenia.setText(this.usuario.getContrasenia());

        if(this.usuario.getTipoUsuario().equals("Administrador")){
            rbAdministrador.setChecked(true);
        }else{
            rbUsuario.setChecked(true);
        }
    }
}
