package com.chen.medicine_mall.mapper;

import com.chen.medicine_mall.pojo.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SumMapper {

    int deleteByExample(SumExample example);

    void batchDeletes(List<String> list);


    int insert(Sum record);

    List<Sum> selectByExample(SumExample example);

    List<Sum> selectAll();

    List<Sum> selectByNo(Sum sum);

    List<Sum> selectByCno(Sum sum);

    List<Sum> selectByOne(Sum sum);

    List<Sum> selectLikeByOne(Sum sum);

    int updateByExampleSelective(@Param("record") Sum record, @Param("example") SumExample example);

    int updateByExample(@Param("record") Sum record, @Param("example") SumExample example);

    int updateCam(@Param("sum") Sum sum, @Param("client")Client client, @Param("agency")Agency agency, @Param("medicine")Medicine medicine);

    int updateCamTest(Sum record, @Param("cno") String cno, @Param("ano")String ano, @Param("mno")String mno);

    List<Sum> selectAllOrderBy(Sum sum);
}