/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_db_ddr_2;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;*/

/**
 *
 * @author Julio Galvis
 */
public abstract class ConexionDB {
    protected Connection conexion;
    protected Statement sentencia;
    protected ResultSet resultSet;
    
    /**
     * @param claseNombre
     * @param cadenaConexion 
     */
    
    public ConexionDB(String claseNombre, String cadenaConexion) {
        try {
            Class.forName(claseNombre);
            conexion = DriverManager.getConnection(cadenaConexion);
            conexion.setAutoCommit(false);
        } catch(ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public ConexionDB(String claseNombre, String cadenaConexion, String usuario, String pass) {
        try {
            Class.forName(claseNombre);
            conexion = DriverManager.getConnection(cadenaConexion, usuario, pass);
            conexion.setAutoCommit(false);
        } catch(ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Connection getConexion() {
        return conexion;
    }

    public Statement getSentencia() {
        return sentencia;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }
    
    public void commit() {
        try {
            conexion.commit();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void rollback() {
        try {
            conexion.rollback();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
