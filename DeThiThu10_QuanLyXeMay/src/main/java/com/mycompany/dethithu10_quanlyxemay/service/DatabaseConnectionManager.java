/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dethithu10_quanlyxemay.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ADMIN
 */
public class DatabaseConnectionManager {

    private final String url;

    public DatabaseConnectionManager(String databaseName, String userName, String passWord) {
        this.url = "jdbc:sqlserver://localhost:1433;database=" + databaseName
                + ";user=" + userName
                + ";password=" + passWord
                + ";encrypt=true;"
                + "trustServerCertificate=true;"
                + "loginTimeout=30;";
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(this.url);
    }
}
