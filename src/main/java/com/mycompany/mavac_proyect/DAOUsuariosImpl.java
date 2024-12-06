/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavac_proyect;

import com.mycompany.db.Database;
import com.mycompany.interfaces.DAOUsuarios;
import com.mycompany.models.Usuarios;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class DAOUsuariosImpl extends Database implements DAOUsuarios{

    @Override
    public void registrar(Usuarios user) throws Exception {
        try{
            this.Conectar();
            PreparedStatement st=this.conexion.prepareStatement("INSERT INTO Usuarios(Nombre,ApellidoPaterno,ApellidoMaterno,Identificacion,Residencia,Direccion,Telefono) VALUE(?,?,?,?,?,?,?)");
            st.setString(1,user.getNombre());
            st.setString(2,user.getApellido_p());
            st.setString(3,user.getApellido_m());
            st.setInt(4,user.getIdentificacion());
            st.setString(5,user.getResidencia());
            st.setString(6, user.getDireccion());
            st.setString(7, user.getTelefono());
            st.executeUpdate();
            st.close();
            
        }catch (Exception e){
            throw e;
        }finally{
            this.Cerrar();
        }
    }

    @Override
    public void modificar(Usuarios user) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(Usuarios user) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Usuarios> listar() throws Exception {
        List<Usuarios> lista=null;
        try{
            this.Conectar();
            PreparedStatement st=this.conexion.prepareStatement("SELECT * FROM usuarios;");
            lista =new ArrayList();
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                Usuarios usuario=new Usuarios();
                usuario.setNombre(rs.getString("Nombre"));
                usuario.setApellido_p(rs.getString("ApellidoPaterno"));
                usuario.setApellido_m(rs.getString("ApellidoMaterno"));
                usuario.setIdentificacion(rs.getInt("Identificacion"));
                usuario.setResidencia(rs.getString("Residencia"));
                usuario.setDireccion(rs.getString("Direccion"));
                usuario.setTelefono(rs.getString("Telefono"));
                lista.add(usuario);

            }
            rs.close();
            st.close();
        }catch(Exception e){
            throw e;
        }finally{
            this.Cerrar();
        }
        return lista;
    }


    
}
