package com.chen.medicine_mall.service.imp;

import com.chen.medicine_mall.mapper.ClientMapper;
import com.chen.medicine_mall.pojo.Client;
import com.chen.medicine_mall.pojo.ClientExample;
import com.chen.medicine_mall.utils.TestUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ClientServiceImplTest extends TestUtils {

    @Autowired
    private ClientMapper clientMapper;
    @Test
    public void updateByPrimaryKey() {
        Client record = new Client();
        record.setCno("c001");
        record.setCname("成龙");
        record.setCage(50);
        int i = clientMapper.updateByPrimaryKeySelective(record);
        //System.out.println(i);
    }

    @Test
    public void insert() {
    }

    @Test
    public void selectByExample() {
    }

    @Test
    public void selectByClient() {
    }

    @Test
    public void selectSunExample() {
        Client record = new Client();
        record.setCno("c");
        ClientExample example = new ClientExample();
        ClientExample.Criteria criteria = example.createCriteria();
        if(record.getCno() != null){
            criteria.andCnoLike("%"+record.getCno()+"%");
        }
        if(record.getCname() != null){
            criteria.andCnameLike("%"+record.getCname()+"%");
        }
        if(record.getCsex() != null){
            criteria.andCsexLike("%"+record.getCsex()+"%");
        }
        if(record.getCage() != null){
            criteria.andCageEqualTo(record.getCage());
        }
        if(record.getCaddress() != null){
            criteria.andCaddressLike("%"+record.getCaddress()+"%");
        }
        if(record.getCphone() != null){
            criteria.andCphoneLike("%"+record.getCphone()+"%");
        }
        if(record.getCsymptom() != null){
            criteria.andCsymptomLike("%"+record.getCsymptom()+"%");
        }
        if(record.getCdate() != null){
            criteria.andCdateEqualTo(record.getCdate());
        }
        clientMapper.selectByExample(example).forEach(i -> System.out.println(i.toString()));
    }
}