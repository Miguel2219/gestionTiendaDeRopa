/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.interfaces;

import com.mycompany.models.Productos;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public interface DAOProductos {
    public void registrar(Productos product)throws Exception;
    public void editar(Productos product)throws Exception;
    public void borrar(Productos product)throws Exception;
    public List<Productos> listar() throws Exception;
}
