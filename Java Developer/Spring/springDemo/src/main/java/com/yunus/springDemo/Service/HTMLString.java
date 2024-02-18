package com.yunus.springDemo.Service;

import com.yunus.springDemo.DataAccess.JDBCUserInfoDAL;

public class HTMLString {
    JDBCUserInfoDAL jdbcUserInfoDAL = new JDBCUserInfoDAL();

    public HTMLString() throws Exception {
    }

    public String getPageStatement() {
        return pageStatement;
    }

    public void setPageStatement(String pageStatement) {
        this.pageStatement = pageStatement;
    }

    private String pageStatement = "<!DOCTYPE html>\n" +
            "<html lang=\"tr\">\n" +
            "    <head>\n" +
            "        <meta charset=\"utf-8\">\n" +
            "        <title>Kayıt Formu</title>\n" +
            "\n" +
            "        <style>\n" +
            "            table{\n" +
            "                border-style: ridge;\n" +
            "                border-width: 10px;\n" +
            "                height: auto;\n" +
            "                width: auto;\n" +
            "                border-collapse: collapse;\n" +
            "                font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;\n" +
            "                font-style: italic;\n" +
            "                color: crimson;\n" +
            "                background-color: aqua;\n" +
            "            }\n" +
            "            input.buton{\n" +
            "                width: 70px;\n" +
            "            }\n" +
            "            #arama{\n" +
            "                border-image: url(Pictures/Untitled.jpeg);\n" +
            "                border-image-source: image(Untitled);\n" +
            "            }\n" +
            "        </style>\n" +
            "    </head>\n" +
            "    <body>\n" +
            "       <script>document.write(navigator.javaEnabled())</script>"+
            "        <form action=\"/\" methode=\"post\">\n" +
            "            <table border=\"3\">\n" +
            "                <tr><td colspan=\"3\"><h3 style=\"color: black;\">Kişi Tablosu</h3></td></tr>\n" +
            "                <tr>\n" +
            "                    <th>Tel</th><th>İsim</th><th>Soy İsim</th>\n" +
            "                </tr>\n" +
            "                <tr>\n" +
            "                    <td>"+jdbcUserInfoDAL.readTable().getFirst()+"</td><td>"+jdbcUserInfoDAL.readTable().get(1)+"</td><td>"+jdbcUserInfoDAL.readTable().get(2)+"</td>\n" +
            "                </tr>\n" +
            "            </table><br><br>\n" +
            "            <table>\n" +
            "                <tr>\n" +
            "                    <td><input type=\"text\" name=\"tel\" placeholder=\"Telefon numarası girin\"></td>\n" +
            "                    <td><input type=\"text\" name=\"name\" placeholder=\"İsim girin\"></td>\n" +
            "                    <td><input type=\"text\" name=\"surname\" placeholder=\"Soyisim girin\"></td>\n" +
            "                    <td><input type=\"submit\" value=\"Gönder\"></td>\n" +
            "                </tr>\n" +
            "            </table>\n" +
            "            <table >\n" +
            "                <tr>\n" +
            "                </tr>\n" +
            "            </table>\n" +
            "        </form>\n" +
            "    </body>\n" +
            "</html>";
}
