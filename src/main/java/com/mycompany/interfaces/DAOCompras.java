/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.interfaces;

import com.mycompany.models.Compras;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public interface DAOCompras {
    public void registrar(Compras compra)throws Exception;
    public List<Compras> listar() throws Exception;
}
