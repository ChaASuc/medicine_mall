package com.chen.medicine_mall.mapper;

import com.chen.medicine_mall.pojo.Client;
import com.chen.medicine_mall.pojo.ClientExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClientMapper {
    int countByExample(ClientExample example);

    int deleteByExample(ClientExample example);

    int deleteByPrimaryKey(String cno);

    int insert(Client record);

    int insertSelective(Client record);

    List<Client> selectByExample(ClientExample example);

    Client selectByPrimaryKey(String cno);


    Client selectByClient(@Param("cname") String name, @Param("cpassword") String password);

    int updateByExampleSelective(@Param("record") Client record, @Param("example") ClientExample example);

    int updateByExample(@Param("record") Client record, @Param("example") ClientExample example);

    int updateByPrimaryKeySelective(Client record);

    int updateByPrimaryKey(Client record);
}