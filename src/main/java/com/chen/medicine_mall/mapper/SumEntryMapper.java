package com.chen.medicine_mall.mapper;

import com.chen.medicine_mall.pojo.Admin;
import com.chen.medicine_mall.pojo.AdminExample;
import com.chen.medicine_mall.pojo.SumEntry;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SumEntryMapper {

    int deleteBySumEntry(SumEntry sumEntry);

    int insertCam(SumEntry sumEntry);

    List<Admin> selectByExample(AdminExample example);


    Admin selectByPrimaryKey(String ano);

    Admin selectByAdmin(@Param("aname") String name, @Param("apassword") String password);

    int updateByExampleSelective(@Param("record") Admin record, @Param("example") AdminExample example);

    int updateByExample(@Param("record") Admin record, @Param("example") AdminExample example);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}