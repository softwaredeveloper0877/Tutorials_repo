package com.yunus.springDemo.DataAccess.DataBaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PostgreConnection {
    private String password = "yonca123";
    private String url = "jdbc:postgresql://localhost:5432/web_app";
    private String username = "postgres";
    private String driver = "org.postgresql.Driver";

    public ResultSet prepareConnection(String query) throws Exception{
        Class.forName(getDriver()); // Driver name
        Connection connection = DriverManager.getConnection(getUrl(),getUsername(),getPassword());
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        return resultSet;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
