/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.interfaces;

import com.mycompany.models.Usuarios;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public interface DAOUsuarios {
    public void registrar(Usuarios user)throws Exception;
    public void modificar(Usuarios user)throws Exception;
    public void eliminar(Usuarios user)throws Exception;
    public List<Usuarios> listar()throws Exception;
    
}
