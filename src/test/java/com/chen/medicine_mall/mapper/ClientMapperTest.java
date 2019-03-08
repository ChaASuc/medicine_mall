package com.chen.medicine_mall.mapper;

import com.chen.medicine_mall.pojo.Client;
import com.chen.medicine_mall.pojo.ClientExample;
import com.chen.medicine_mall.utils.TestUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Date;
import java.util.List;

public class ClientMapperTest extends TestUtils {

//    c001	张三	男	24	 肇庆学院	123456789	受寒	2018-12-01 11:16:59.000000	123456
    @Autowired
    private ClientMapper clientMapper;

    @Test
    public void insert() {
        Client client = new Client();
        client.setCno("c011");
        client.setCname("张三");
        client.setCsex("男");
        client.setCage(20);
        client.setCphone("123456879");
        client.setCaddress("肇庆学院");
        client.setCsymptom("受寒");
        Date date = new Date(System.currentTimeMillis());
        client.setCdate(date);
        client.setCpassword("123456");
        int insert = clientMapper.insert(client);
        System.out.println(insert);
    }

    @Test
    public void selectByExample() {
        ClientExample clientExample = new ClientExample();
        ClientExample.Criteria criteria = clientExample.createCriteria();
        criteria.andCnoEqualTo("c001");
        List<Client> clients = clientMapper.selectByExample(clientExample);
        clients.forEach(i -> System.out.println(i.toString()));
    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void updateByExample() {
    }

    @Test
    public void updateByPrimaryKey() {
    }
}