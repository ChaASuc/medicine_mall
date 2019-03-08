package com.chen.medicine_mall.service;

import com.chen.medicine_mall.pojo.Admin;

public interface AdminService {

    /*用户注册*/
    public boolean updateByPrimaryKey(Admin man);

    public boolean insert(Admin man);

//    public List<Admin> selectByExample(Admin admin);

    public Admin selectByPrimaryKey(String ano);

    public Admin selectByAdmin(String name, String passoword);


}
