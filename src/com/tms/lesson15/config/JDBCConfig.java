package com.tms.lesson15.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConfig {

    public static Connection getConnect(){

        String url = "jdbc:postgresql://localhost:5432/";
        String db = "postgres";
        String userName = "postgres";
        String password = "1840625";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url + db, userName, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

}
