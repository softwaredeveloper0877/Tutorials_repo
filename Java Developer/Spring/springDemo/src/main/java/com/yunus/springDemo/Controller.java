package com.yunus.springDemo;

import com.yunus.springDemo.DataAccess.JDBCUserInfoDAL;
import com.yunus.springDemo.Service.HTMLString;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/")
public class Controller {
    HTMLString htmlString = new HTMLString();
    JDBCUserInfoDAL jdbcUserInfoDAL = new JDBCUserInfoDAL();

    public Controller() throws Exception {
    }

    @GetMapping("/")
    public String getUsers() throws Exception{

        return htmlString.getPageStatement();
    }

    @PostMapping("/")
    public String submitForm(@RequestParam("tel") String tel, @RequestParam("name") String name, @RequestParam("surname") String surname) throws Exception {

        jdbcUserInfoDAL.insert("people(tel, name, surname)", "values("+tel+","+name+","+surname+")");

        return htmlString.getPageStatement();
    }

}
