package com.chen.medicine_mall.service.imp;

import com.chen.medicine_mall.mapper.AgencyMapper;
import com.chen.medicine_mall.pojo.Agency;
import com.chen.medicine_mall.pojo.AgencyExample;
import com.chen.medicine_mall.service.AgencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName AgencyServiceImpl
 * @Description 事务逻辑处理
 * @Author chen
 * @Data 2018/12/19 16:46
 * @Version 1.0
 **/
@Service
public class AgencyServiceImpl implements AgencyService {

    @Autowired
    private AgencyMapper agencyMapper;

    /*用户注册*/
    @Override
    public boolean updateByPrimaryKey(Agency man) {
        return agencyMapper.updateByPrimaryKey(man) > 0 ? true: false;
    }

    @Override
    public boolean insert(Agency man) {
        return agencyMapper.insert(man) > 0 ? true: false;
    }

    @Override
    public List<Agency> selectLikeByExample(Agency record) {
        AgencyExample example = new AgencyExample();
        AgencyExample.Criteria criteria = example.createCriteria();
        if(record.getAno() != null){
            criteria.andAnoLike("%"+record.getAno()+"%");
        }
        if(record.getAname() != null){
            criteria.andAnameLike("%"+record.getAname()+"%");
        }
        if(record.getAsex() != null){
            criteria.andAsexLike("%"+record.getAsex()+"%");
        }
        if(record.getAphone() != null){
            criteria.andAphoneLike("%"+record.getAphone()+"%");
        }
        if(record.getAremark() != null){
            criteria.andAremarkLike("%"+record.getAremark()+"%");
        }
//        clientMapper.selectByExample(example).forEach(i -> System.out.println(i.toString()));
        return agencyMapper.selectByExample(example);
    }

    @Override
    public List<Agency> selectByExample(Agency record) {
        AgencyExample example = new AgencyExample();
        AgencyExample.Criteria criteria = example.createCriteria();
        if(record.getAno() != null && record.getAno() !=""){
            criteria.andAnoEqualTo(record.getAno());
        }
        if(record.getAname() != null && record.getAname() != ""){
            criteria.andAnameEqualTo(record.getAname());
        }
        if(record.getAphone() != null && record.getAphone() != ""){
            criteria.andAphoneEqualTo(record.getAphone());
        }
        if(record.getAremark() != null && record.getAremark() != ""){
            criteria.andAremarkEqualTo(record.getAremark());
        }
        if(record.getAsex() != null && record.getAsex() != ""){
            criteria.andAsexEqualTo(record.getAsex());
        }
//        AgencyMapper.selectByExample(example).forEach(i -> System.out.println(i.toString()));
        return agencyMapper.selectByExample(example);
    }

    @Override
    public Agency selectByAgency(String name, String passoword) {
        return agencyMapper.selectByAgency(name, passoword);
    }

    @Override
    public Agency selectByAno(String cno) {
        return agencyMapper.selectByPrimaryKey(cno);
    }

    @Override
    public Agency selectByAname(String aname) {
        return agencyMapper.selectByAname(aname);
    }

    @Override
    public int deleteByAno(String ano) {
        return agencyMapper.deleteByPrimaryKey(ano);
    }
}
