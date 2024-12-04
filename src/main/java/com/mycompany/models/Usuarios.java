/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.models;

/**
 *
 * @author USUARIO
 */
public class Usuarios {
    private String Nombre;
    private String Apellido_p;
    private String Apellido_m;
    private int Identificacion;
    private String Residencia;
    private String Direccion;
    private String Telefono;

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido_p(String Apellido_p) {
        this.Apellido_p = Apellido_p;
    }

    public void setApellido_m(String Apellido_m) {
        this.Apellido_m = Apellido_m;
    }

    public void setIdentificacion(int Identificacion) {
        this.Identificacion = Identificacion;
    }

    public void setResidencia(String Residencia) {
        this.Residencia = Residencia;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido_p() {
        return Apellido_p;
    }

    public String getApellido_m() {
        return Apellido_m;
    }

    public int getIdentificacion() {
        return Identificacion;
    }

    public String getResidencia() {
        return Residencia;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }
    
}
