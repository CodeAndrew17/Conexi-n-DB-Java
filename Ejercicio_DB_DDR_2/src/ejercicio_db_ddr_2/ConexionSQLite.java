/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_db_ddr_2;

/**
 *
 * @author Julio Galvis
 */
public class ConexionSQLite extends ConexionDB {
    
    public ConexionSQLite(String ruta) {
        super("org.sqlite.JDBC", "jdbc:sqlite" + ruta);
    }
    
    
    
}
