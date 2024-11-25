/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_db_ddr_2;

/**
 *
 * @author Julio Galvis
 */
public class ConexionOracle extends ConexionDB {
    
    public ConexionOracle(String host, String puerto, String SID, String usuario, String password) {
        super("oracle.jdbc.driver.OracleDriver", "jdbc:oracle:thin:@" + host + ":" + puerto + "/" + SID, usuario, password);
    }
     
    public ConexionOracle(String host, String SID, String usuario, String password) {
        super("oracle.jdbc.driver.OracleDriver", "jdbc:oracle:thin:@" + host + ":1521:" + SID, usuario, password);
    }
    
}
