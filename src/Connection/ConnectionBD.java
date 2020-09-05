/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author diosl
 */
public class ConnectionBD {

    private Connection connection;
    private String URL;

    public ConnectionBD() {
             //URL: jdbc Driver//File1//File2//File3...//DataBaseName.accdb
        this.URL = "jdbc:ucanaccess://C://BD//DataBase.accdb";
    }
    
    public boolean conectar() {
        try {
            connection = DriverManager.getConnection(URL);
            return true;
        } catch (Exception e) {
            System.err.println(e);
            e.printStackTrace();
            return false;
        }
    }

    public boolean desConectar() {
        if (connection != null) {
            try {
                connection.close();
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                System.err.println("Error: " + e);
                return false;
            }
        }
        return false;
    }

    public Connection getConexion() {
        try {
            connection = DriverManager.getConnection(URL);
            return connection;
        } catch (Exception e) {
            System.err.println(e);
            e.printStackTrace();
            return null;
        }
    }
    
}
