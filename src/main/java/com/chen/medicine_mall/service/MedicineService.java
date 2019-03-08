package com.chen.medicine_mall.service;

import com.chen.medicine_mall.pojo.Medicine;

import java.util.List;

public interface MedicineService {

   /* *//*用户注册*//*
    public boolean updateByPrimaryKey(Admin man);

    public boolean insert(Admin man);

//    public List<Admin> selectByExample(Admin admin);

    public Admin selectByPrimaryKey(String ano);*/

    public List<Medicine> selectByMedicine(Medicine medicine);

    public Medicine selectByMno(String mno);

    public Medicine selectByMname(String mname);

    public List<Medicine> selectByExample(Medicine medicine);

    public int deleteByMno(String mno);

    public void batchDeletes(List<String> list);


    /*用户注册*/
    public boolean updateByPrimaryKey(Medicine medicine);

    public List<Medicine> selectLikeByExample(Medicine medicine);

    public boolean insert(Medicine medicine);


}
