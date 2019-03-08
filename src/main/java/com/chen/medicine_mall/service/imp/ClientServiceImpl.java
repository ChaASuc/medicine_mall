package com.chen.medicine_mall.service.imp;

import com.chen.medicine_mall.mapper.AgencyMapper;
import com.chen.medicine_mall.mapper.ClientMapper;
import com.chen.medicine_mall.mapper.MedicineMapper;
import com.chen.medicine_mall.pojo.*;
import com.chen.medicine_mall.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName ClientServiceImpl
 * @Description 事务逻辑处理
 * @Author chen
 * @Data 2018/12/19 16:46
 * @Version 1.0
 **/
@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientMapper clientMapper;
    @Autowired
    private MedicineMapper medicineMapper;
    @Autowired
    private AgencyMapper agencyMapper;

    /*用户注册处理*/
    @Override
    public boolean updateByPrimaryKey(Client man) {
        return clientMapper.updateByPrimaryKey(man) > 0 ? true: false;
    }

    @Override
    public boolean updateByPrimaryKeySelective(Client man) {
        return clientMapper.updateByPrimaryKeySelective(man) > 0 ? true: false;
    }

    @Override
    public boolean insert(Client man) {
        return clientMapper.insert(man) > 0 ? true: false;
    }

    @Override
    public List<Client> selectByExample(Client record) {
        ClientExample example = new ClientExample();
        ClientExample.Criteria criteria = example.createCriteria();
        if(record.getCno() != null && record.getCno() != ""){
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
//        clientMapper.selectByExample(example).forEach(i -> System.out.println(i.toString()));
        return clientMapper.selectByExample(example);
    }

    @Override
    public List<Client> selectByClient(Client record) {
        ClientExample example = new ClientExample();
        ClientExample.Criteria criteria = example.createCriteria();
        if(record.getCno() != null && record.getCno() != ""){
            criteria.andCnoEqualTo(record.getCno());
        }
        if(record.getCname() != null && record.getCname() != ""){
            criteria.andCnameLike(record.getCname());
        }
        if(record.getCsex() != null && record.getCsex() != ""){
            criteria.andCsexEqualTo(record.getCsex());
        }
        if(record.getCage() != null){
            criteria.andCageEqualTo(record.getCage());
        }
        if(record.getCaddress() != null && record.getCaddress() != ""){
            criteria.andCaddressEqualTo( record.getCaddress() );
        }
        if( record.getCphone() != null && record.getCphone() != ""){
            criteria.andCphoneEqualTo( record.getCphone() );
        }
        if(record.getCsymptom() != null && record.getCsymptom() != ""){
            criteria.andCsymptomEqualTo( record.getCsymptom());
        }
        if(record.getCdate() != null){
            criteria.andCdateEqualTo(record.getCdate());
        }
//        clientMapper.selectByExample(example).forEach(i -> System.out.println(i.toString()));
        return clientMapper.selectByExample(example);
    }


    @Override
    public Client selectByClient(String name, String passoword) {
        return clientMapper.selectByClient(name, passoword);
    }

    @Override
    public Client selectByCnot(String cno) {
        Client client = clientMapper.selectByPrimaryKey(cno);
        return client;
    }

    /*查询购买信息*/
    @Override
    public List<SumExample> selectSunExample(Client client, Medicine medicine, Agency agency) {
        String cno = client.getCno();
        String mno = medicine.getMno();
        String ano = agency.getAno();
//        medicineMapper.selectByExample(medicine)
        return null;
    }

    @Override
    public int deleteByCno(String cno) {
        return clientMapper.deleteByPrimaryKey(cno);
    }
}
