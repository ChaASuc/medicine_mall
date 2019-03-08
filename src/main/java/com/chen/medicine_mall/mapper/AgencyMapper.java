package com.chen.medicine_mall.mapper;

import com.chen.medicine_mall.pojo.Agency;
import com.chen.medicine_mall.pojo.AgencyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AgencyMapper {
    int countByExample(AgencyExample example);

    int deleteByExample(AgencyExample example);

    int deleteByPrimaryKey(String ano);

    int insert(Agency record);

    int insertSelective(Agency record);

    List<Agency> selectByExample(AgencyExample example);

    Agency selectByPrimaryKey(String ano);

    Agency selectByAname(String aname);

    Agency selectByAgency(@Param("aname") String name, @Param("apassword") String password);

    int updateByExampleSelective(@Param("record") Agency record, @Param("example") AgencyExample example);

    int updateByExample(@Param("record") Agency record, @Param("example") AgencyExample example);

    int updateByPrimaryKeySelective(Agency record);

    int updateByPrimaryKey(Agency record);
}