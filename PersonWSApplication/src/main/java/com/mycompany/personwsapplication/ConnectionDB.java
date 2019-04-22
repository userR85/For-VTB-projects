/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.personwsapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Администратор
 */
public class ConnectionDB {
    
            
    private static final String URL = "jdbc:derby://localhost:1527/TestDB;create=true";
    private static final String driver = "org.apache.derby.jdbc.ClientDriver";
    private String user = "TestUser";
    private String pass = "TestPass";

    // Вспомогательный метод получения соединения
    public Connection getConnection() throws Exception {
        Connection connection = null;
        try {
            Class.forName(driver).newInstance();
            connection = DriverManager.getConnection(URL, user, pass);
            //Statement statement = connection.createStatement();
        } 
        catch (InstantiationException | IllegalAccessException | SQLException ex) {
             System.out.println("Connection failed...");
             System.out.println(ex);
             //Logger.getLogger(rolodexBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }
}
