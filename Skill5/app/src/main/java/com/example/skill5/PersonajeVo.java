package com.example.skill5;

public class PersonajeVo {
    private String nombre;
    private String informacion;
    private int foto;

    public PersonajeVo(String nombre, String informacion, int foto) {
        this.nombre = nombre;
        this.informacion = informacion;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getInformacion() {
        return informacion;
    }

    public int getFoto() {
        return foto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
