package com.yunus.springDemo;

import com.yunus.springDemo.DataAccess.JDBCUserInfoDAL;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/")
public class Controller {

    private final JDBCUserInfoDAL jdbcUserInfoDAL = new JDBCUserInfoDAL();

    @GetMapping("/")
    public String getUsers() throws Exception{
       return jdbcUserInfoDAL.readTable();
    }
}
