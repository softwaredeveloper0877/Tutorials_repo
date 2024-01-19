package com.yunus.springDemo.DataAccess;

import java.util.ArrayList;
import java.util.List;

public class UserInfo {

    String tc;
    String isim;
    String id;
    String[] arr;
    public String getId() {
        return id;
    }

    public String getTc() {
        return tc;
    }

    public String getIsim() {
        return isim;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
