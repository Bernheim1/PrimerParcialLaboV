package com.example.bernheimpp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    AdapterUsuarios adapterUsuarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<UsuarioModel> usuarios = new ArrayList<>();

        usuarios.add(new UsuarioModel("JPerez", "Contrasenia", "Administrador"));
        usuarios.add(new UsuarioModel("PRodriguez", "contra123", "Usuario"));
        usuarios.add(new UsuarioModel("RJuarez", "aaa333", "Usuario"));
        usuarios.add(new UsuarioModel("MLopez", "asd123", "Administrador"));
        usuarios.add(new UsuarioModel("LPorto", "lkn213", "Usuario"));
        usuarios.add(new UsuarioModel("LPerez", "Contrasenia123", "Usuario"));
        usuarios.add(new UsuarioModel("AGomez", "nnnooo", "Administrador"));
        usuarios.add(new UsuarioModel("CCarlos", "asdasd", "Usuario"));
        usuarios.add(new UsuarioModel("PPerez", "perez132", "Usuario"));
        usuarios.add(new UsuarioModel("AFernandez", "presidente", "Administrador"));

        this.adapterUsuarios = new AdapterUsuarios(usuarios, this);

        RecyclerView rv = super.findViewById(R.id.rvUsuarios);
        rv.setAdapter(adapterUsuarios);
        rv.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 1){
            if(resultCode == Activity.RESULT_OK){
                String result = data.getStringExtra("indice");
                Integer aux;
                aux = Integer.parseInt(result);

                this.adapterUsuarios.notifyItemChanged(aux);
            }
        }
    }


}