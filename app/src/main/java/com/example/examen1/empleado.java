package com.example.examen1;

public class empleado {
    public String nombre;
    public String paterno;
    public String materno;
    public String sexo;
    public int edad;
    public String puesto;
    public String correo;
    public String password;
    public int foto;

    public empleado(String nombre, String paterno, String materno, String sexo, int edad, String puesto, String correo, String password, int foto){
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.sexo = sexo;
        this.edad = edad;
        this.puesto = puesto;
        this.correo = correo;
        this.password = password;
        this.foto = foto;
    }
}
