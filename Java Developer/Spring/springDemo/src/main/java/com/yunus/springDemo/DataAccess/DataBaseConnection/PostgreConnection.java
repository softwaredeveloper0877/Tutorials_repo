package com.yunus.springDemo.DataAccess.DataBaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PostgreConnection {

    public ResultSet prepareConnection(String query) throws Exception{
        Class.forName(getDriver());
        Connection connection = DriverManager.getConnection(getUrl(),getUsername(),getPassword());
        Statement statement = connection.createStatement();
        return statement.executeQuery(query);
    }

    public String getDriver() {
        return "org.postgresql.Driver";
    }

    public String getUrl() {
        return "jdbc:postgresql://localhost:5432/web_app";
    }

    public String getUsername() {
        return "yunus";
    }

    public String getPassword() {
        return "yonca123";
    }
}
