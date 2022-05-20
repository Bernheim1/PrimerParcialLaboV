package com.example.bernheimpp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

public class editActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        ActionBar actionBar = super.getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        Intent i = getIntent();
        Bundle extras = i.getExtras();

        String nombre = extras.getString("nombre");
        String contrasenia = extras.getString("contrasenia");
        String tipoUsuario = extras.getString("tipoUsuario");
        Integer indice = extras.getInt("indice");

        UsuarioModel usuario = new UsuarioModel(nombre,contrasenia,tipoUsuario,indice);

        UsuarioController controller = new UsuarioController(usuario, this);

        UsuarioView view = new UsuarioView(usuario, this, controller);

        controller.setView(view);

        view.mostrarModelo();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}