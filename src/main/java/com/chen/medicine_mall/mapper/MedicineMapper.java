package com.chen.medicine_mall.mapper;

import com.chen.medicine_mall.pojo.Medicine;
import com.chen.medicine_mall.pojo.MedicineExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MedicineMapper {
    int countByExample(MedicineExample example);

    int deleteByExample(MedicineExample example);

    int deleteByPrimaryKey(String mno);

    void batchDeletes(List<String> list);

    int insert(Medicine record);

    int insertSelective(Medicine record);

    List<Medicine> selectByExample(MedicineExample example);

    Medicine selectByPrimaryKey(String mno);

    Medicine selectByMname(String mname);

    int updateByExampleSelective(@Param("record") Medicine record, @Param("example") MedicineExample example);

    int updateByExample(@Param("record") Medicine record, @Param("example") MedicineExample example);

    int updateByPrimaryKeySelective(Medicine record);

    int updateByPrimaryKey(Medicine record);
}