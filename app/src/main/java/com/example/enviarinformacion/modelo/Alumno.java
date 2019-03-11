package com.example.enviarinformacion.modelo;

public class Alumno {

    private Integer Id;
    private String Nombre;

    public Alumno(Integer id, String nombre)
    {
        Id = id;
        Nombre = nombre;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }





}
