package com.chen.medicine_mall.service.imp;

import com.chen.medicine_mall.mapper.SumMapper;
import com.chen.medicine_mall.pojo.*;
import com.chen.medicine_mall.service.SumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName SumServiceImpl
 * @Description TODO
 * @Author chen
 * @Data 2018/12/23 23:46
 * @Version 1.0
 **/
@Service
public class SumServiceImpl implements SumService {
    @Autowired
    private SumMapper sumMapper;

    @Override
    public List<Sum> selectByNo(Sum sum) {
        return sumMapper.selectByNo(sum);
    }

    @Override
    public int deleteByCnoAnoMno(String Cno, String Ano, String Mno) {
        SumExample sumExample = new SumExample();
        SumExample.Criteria criteria = sumExample.createCriteria();
        criteria.andCnoEqualTo(Cno);
        criteria.andAnoEqualTo(Ano);
        criteria.andMnoEqualTo(Mno);
        int i = sumMapper.deleteByExample(sumExample);
        return i;

    }

    @Override
    public List<Sum> selectByOne(Sum sum) {
        return sumMapper.selectByOne(sum);
    }

    @Override
    public List<Sum> selectLikeByOne(Sum sum) {
        return sumMapper.selectLikeByOne(sum);
    }

    @Override
    public List<Sum> UpdateOne(Sum sum) {
        return null;
    }

    @Override
    public List<Sum> UpdateMall(Sum sum, Client client, Agency agency, Medicine medicine) {
        int i = sumMapper.updateCam(sum, client, agency, medicine);
        List<Sum> sums = sumMapper.selectByNo(sum);
        return sums;
    }

    @Override
    public void batchDeletes(List<String> list) {
        sumMapper.batchDeletes(list);
    }

    @Override
    public boolean insert(Sum sum) {
        try {
            sumMapper.insert(sum);
        }catch (Exception e){
//            System.out.println("报错提示");
            return false;
        }
//        System.out.println("通过提示");
        return true;
    }

    @Override
    public List<Sum> selectByCno(Sum sum) {
        return sumMapper.selectByCno(sum);
    }

    @Override
    public int deleteBySum(Sum sum) {
        SumExample sumExample = new SumExample();
        SumExample.Criteria criteria = sumExample.createCriteria();
        if(sum.getCno() != null){
            criteria.andCnoEqualTo(sum.getCno());
        }
        if(sum.getAno() != null){
            criteria.andAnoEqualTo(sum.getAno());
        }
        if(sum.getMno() != null){
            criteria.andCnoEqualTo(sum.getMno());
        }
        int i = sumMapper.deleteByExample(sumExample);
        return i;
    }

    @Override
    public List<Sum> selectAllOrderBy(Sum sum) {
        return sumMapper.selectAllOrderBy(sum);
    }
}
