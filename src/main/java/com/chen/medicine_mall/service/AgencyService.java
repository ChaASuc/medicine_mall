package com.chen.medicine_mall.service;

import com.chen.medicine_mall.pojo.Agency;

import java.util.List;

public interface AgencyService {

    /*用户注册*/
    public boolean updateByPrimaryKey(Agency man);

    public boolean insert(Agency man);

    public List<Agency> selectLikeByExample(Agency man);

    public List<Agency> selectByExample(Agency man);

    public Agency selectByAgency(String name, String passoword);

    public Agency selectByAno(String cno);

    public Agency selectByAname(String aname);

    public int deleteByAno(String ano);


}
