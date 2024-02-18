package com.yunus.springDemo.DataAccess;

import com.yunus.springDemo.DataAccess.DataBaseConnection.PostgreConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCUserInfoDAL{
    PostgreConnection postgreConnection = new PostgreConnection();

    public void insert(String tableAndCollumns, String values) throws Exception{
        postgreConnection.prepareConnection("insert into "+tableAndCollumns+" VALUES"+values);

    }

    public ArrayList<String> readTable() throws Exception{
        ResultSet resultSet = postgreConnection.prepareConnection("select * from people");
        String[] query ={"tel", "name", "surname"};
        int i = 0;
        ArrayList<String> data = new ArrayList<>();
        while (resultSet.next()) {
            while (i < query.length) {
                data.add(resultSet.getString(query[i]));
                i++;
            }
            i = 0;
        }
        return data;
    }
}
