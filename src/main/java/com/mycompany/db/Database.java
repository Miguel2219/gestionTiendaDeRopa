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
    private final String JDBC_DRIVER="com.mysql.jdbc.Driver";
    private final String DB_URL="jdbc:mysql://localhost:3306/baseDeDatos";
    
    private final String USER="Miguel";
    private final String PASS="05544";
    
    public void Conectar() throws ClassNotFoundException{
        try {
            conexion=DriverManager.getConnection(DB_URL,USER,PASS);
            Class.forName(JDBC_DRIVER);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
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
