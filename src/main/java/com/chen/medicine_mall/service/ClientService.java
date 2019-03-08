package com.chen.medicine_mall.service;

import com.chen.medicine_mall.pojo.Agency;
import com.chen.medicine_mall.pojo.Client;
import com.chen.medicine_mall.pojo.Medicine;
import com.chen.medicine_mall.pojo.SumExample;

import java.util.List;

public interface ClientService {

    /*用户注册*/
    public boolean updateByPrimaryKey(Client man);

    public boolean updateByPrimaryKeySelective(Client man);


    public boolean insert(Client man);

    public List<Client> selectByExample(Client man);

    public List<Client> selectByClient(Client man);

    public Client selectByClient(String name, String passoword);

    public Client selectByCnot(String cno);

    /*添加购买药品和经办人的信息并查询*/
    public List<SumExample> selectSunExample(Client client, Medicine medicine, Agency agency);

    public int deleteByCno(String cno);
}
