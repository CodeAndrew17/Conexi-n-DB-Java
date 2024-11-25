/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_db_ddr_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Julio Galvis
 */
public class Ejercicio_DB_DDR_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/empleadoss_departamentoss", "root", "");
            
            Statement sentencia = conexion.createStatement();
            ResultSet resultSet = sentencia.executeQuery("select * from empleados");
            
            while(resultSet.next()) {
                
                System.out.println(resultSet.getString("nomEmp"));
                System.out.println(resultSet.getString("salEmp"));
                
            }
            
            resultSet.close();
            sentencia.close();
            
            conexion.close();
            
        } catch(ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
