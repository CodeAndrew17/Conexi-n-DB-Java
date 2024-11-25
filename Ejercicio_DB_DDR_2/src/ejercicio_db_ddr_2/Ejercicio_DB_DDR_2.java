/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_db_ddr_2;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Julio Galvis
 */
public class Ejercicio_DB_DDR_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
		try {

            //Creo la conexión
            ConexionMySQL conexion = new ConexionMySQL("localhost", "empleadoss_departamentoss", "root", "");

            //Ejecuto la consulta
            conexion.ejecutarConsulta("select * from empleados");

            //Recojo el ResultSet
            ResultSet rs = conexion.getResultSet();

            //Muestro la consulta
            while (rs.next()) {
                System.out.println(rs.getString("nomEmp"));
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
