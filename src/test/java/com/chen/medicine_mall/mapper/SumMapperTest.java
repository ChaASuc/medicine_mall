package com.chen.medicine_mall.mapper;

import com.chen.medicine_mall.pojo.Sum;
import com.chen.medicine_mall.pojo.SumExample;
import com.chen.medicine_mall.utils.TestUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SumMapperTest extends TestUtils {

    @Autowired
    private SumMapper sumMapper;

    @Test
    public void deleteBySumEntry() {
        SumExample sumExample = new SumExample();
        SumExample.Criteria criteria = sumExample.createCriteria();
        criteria.andAnoEqualTo("a001");
        criteria.andCnoEqualTo("c001");
        criteria.andMnoEqualTo("m001");
        int i = sumMapper.deleteByExample(sumExample);
        //System.out.println(i);
    }

    @Test
    public void InsertCam() {
        Sum sum = new Sum();
        sum.setAno("a001");
        sum.setCno("c002");
        sum.setMno("m003");
        int i = sumMapper.insert(sum);
        System.out.println(i);
    }

    @Test
    public void SelectSum() {
        SumExample sum = new SumExample();
        SumExample.Criteria criteria = sum.createCriteria();
        List<Sum> sums = sumMapper.selectByExample(sum);
        sums.forEach(i -> System.out.println(i.toString()));
    }

    @Test
    public void SelectAll() {
        /*List<Sum> sums = sumMapper.selectAll();
        sums.forEach(i -> System.out.println(i.toString()));*/
        /*Sum sum = new Sum();
        sum.setCno("c001");
        List<Sum> sums1 = sumMapper.selectByNo(sum);
        sums1.forEach(i -> System.out.println(i.toString()));*/
        Sum sum = new Sum();
        sum.setCno("c001");
        List<Sum> sums = sumMapper.selectAllOrderBy(sum);
        sums.forEach(i -> System.out.println(i.toString()));

    }
}