package com.example.bernheimpp;

public class UsuarioModel {

    private String nombre;
    private String contrasenia;
    private String tipoUsuario;
    private Integer indice;

    public UsuarioModel(String nombre, String contrasenia, String tipoUsuario){
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.tipoUsuario = tipoUsuario;
    }

    public UsuarioModel(String nombre, String contrasenia, String tipoUsuario, Integer indice){
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.tipoUsuario = tipoUsuario;
        this.indice = indice;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public Integer getIndice() {
        return indice;
    }

    public void setIndice(Integer indice) {
        this.indice = indice;
    }
}
