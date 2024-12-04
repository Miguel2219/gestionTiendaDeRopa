/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.models;

/**
 *
 * @author USUARIO
 */
public class Productos {
    private String Nombre_producto;
    private int cantidad;
    private float precioVenta;
    private float precioCosto;
    private int ID;
    private String Marca;
    private String Descripcion;

    public void setNombre_producto(String Nombre_producto) {
        this.Nombre_producto = Nombre_producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public void setPrecioCosto(float precioCosto) {
        this.precioCosto = precioCosto;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getNombre_producto() {
        return Nombre_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }

    public float getPrecioCosto() {
        return precioCosto;
    }

    public int getID() {
        return ID;
    }

    public String getMarca() {
        return Marca;
    }

    public String getDescripcion() {
        return Descripcion;
    }
}
