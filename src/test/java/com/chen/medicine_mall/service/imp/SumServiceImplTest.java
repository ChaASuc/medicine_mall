package com.chen.medicine_mall.service.imp;

import com.chen.medicine_mall.mapper.SumMapper;
import com.chen.medicine_mall.pojo.Agency;
import com.chen.medicine_mall.pojo.Client;
import com.chen.medicine_mall.pojo.Medicine;
import com.chen.medicine_mall.pojo.Sum;
import com.chen.medicine_mall.utils.TestUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SumServiceImplTest extends TestUtils {

    @Autowired
    private SumMapper sumMapper;
    @Test
    public void selectByOne() {
        Sum sum = new Sum();
        sum.setCno("c001");
        sum.setAname("张医生");
        sum.setMname("退烧药");
        List<Sum> sums = sumMapper.selectByOne(sum);
        sums.forEach(i -> System.out.println(i.toString()));
    }
    @Test
    public void selectLikeByOne() {
        Sum sum = new Sum();
        sum.setCno("1");
        sum.setAname("张123");
        sum.setMname("退");
        List<Sum> sums = sumMapper.selectLikeByOne(sum);
        sums.forEach(i -> System.out.println(i.toString()));
    }

    @Test
    public void UpdateOne() {
        Sum sum = new Sum();
        sum.setCno("c001");
        sum.setAno("a001");
        sum.setMno("m001");
        Client client = new Client();
        client.setCno("c003");
        Agency agency = new Agency();
        agency.setAno("a003");
        Medicine medicine = new Medicine();
        medicine.setMno("m003");
//        int i1 = sumMapper.updateCamTest(sum, "c002", "a002", "m002");
        int i1 = sumMapper.updateCam(sum, client, agency, medicine);
        System.out.println(i1);
    }
}