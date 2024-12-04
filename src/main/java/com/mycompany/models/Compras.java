/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.models;

import java.sql.Date;

/**
 *
 * @author USUARIO
 */
public class Compras {
    private int id_usuario;
    private int id_producto;
    private String fechaVenta;
    private float ganancia;
    private boolean Devoluciones;
    private String fechaDevolucion;
    private String razonDevolucion;

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public void setGanancia(float ganancia) {
        this.ganancia = ganancia;
    }

    public void setDevoluciones(boolean Devoluciones) {
        this.Devoluciones = Devoluciones;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public void setRazonDevolucion(String razonDevolucion) {
        this.razonDevolucion = razonDevolucion;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public int getId_producto() {
        return id_producto;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public float getGanancia() {
        return ganancia;
    }

    public boolean isDevoluciones() {
        return Devoluciones;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public String getRazonDevolucion() {
        return razonDevolucion;
    }
    
}
