package com.chen.medicine_mall.service;

import com.chen.medicine_mall.pojo.Agency;
import com.chen.medicine_mall.pojo.Client;
import com.chen.medicine_mall.pojo.Medicine;
import com.chen.medicine_mall.pojo.Sum;

import java.util.List;

public interface SumService {

   /* *//*用户注册*//*
    public boolean updateByPrimaryKey(Admin man);

    public boolean insert(Admin man);

//    public List<Admin> selectByExample(Admin admin);

    public Admin selectByPrimaryKey(String ano);

    public Admin selectByAdmin(String name, String passoword);*/

//    public Admin selectByPrimaryKey();
    public List<Sum> selectByNo(Sum sum);

    public int deleteByCnoAnoMno(String Cno, String Ano, String Mno);

    public List<Sum> selectByOne(Sum sum);

    public List<Sum> selectLikeByOne(Sum sum);

    public List<Sum> UpdateOne(Sum sum);

    public List<Sum> UpdateMall(Sum sum, Client client, Agency agency, Medicine medicine);

    public void batchDeletes(List<String> list);

    public boolean insert(Sum sum);

    List<Sum> selectByCno(Sum sum);

    public int deleteBySum(Sum sum);

    public List<Sum> selectAllOrderBy(Sum sum);
}
