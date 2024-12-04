/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Database {
    protected Connection conexion;
    private final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
    private final String DB_URL="jdbc:mysql://localhost:3306/baseDeDatos";
    
    private final String USER="root";
    private final String PASS="Gp999999";
    
    public void Conectar() throws ClassNotFoundException, SQLException{
        try {
            Class.forName(JDBC_DRIVER);
            conexion=DriverManager.getConnection(DB_URL,USER,PASS);
            
        } catch (SQLException ex) {
            System.err.println("Error de conexion: "+ex.getMessage());
            throw ex;
        }
     
    }
    
    public void Cerrar() throws SQLException{
        if (conexion!=null){
            if (!conexion.isClosed()){
                conexion.close();
            }
        }
    }
    
}
