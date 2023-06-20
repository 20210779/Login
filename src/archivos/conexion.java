/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivos;

/**
 *
 * @author ESTUDIANTE
 */

import java.sql.*;
public class conexion {
    
        //Creación del metodo de conexión que retorna la conexión
    public static Connection getConexion(){
        
         //Cadena de conexión
                String conexionUrl  = "jdbc:sqlserver://localhost:50021; databaseName=LoginRemedial; user=Rical; password=itr2023; encrypt=true;trustServerCertificate=true";
                            // <- Editar por su puerto de SQL
                            // <- Editar por su base de datos
        
        //Retornamos la conexion
        try{
            
            //Creamos una variable de tipo Connection, al que le pasamos nuestra cadena de conexion
            Connection conn = DriverManager.getConnection(conexionUrl) ;
            //SI funciona, retornamos la conexion
            return conn;
        }catch(SQLException ex){
            //Si no funciona, imprimimos en consola el error y retornamos un valor nulo
            System.out.println(ex.toString());
            return null;
        }
    }
    
}
