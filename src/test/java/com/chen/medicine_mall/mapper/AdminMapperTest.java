package com.chen.medicine_mall.mapper;

import com.chen.medicine_mall.pojo.Admin;
import com.chen.medicine_mall.utils.TestUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class AdminMapperTest extends TestUtils {

    @Autowired
    private AdminMapper adminMapper;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void updateByPrimaryKey() {
        Admin admin = new Admin();
        admin.setAno("a001");
        admin.setAname("admin");
        admin.setApassword("123456");
        admin.setAsex("女");
        admin.setAage(23);
        admin.setAcaddress("肇庆学院");
        admin.setAcphone("123456789");
        int insert = adminMapper.updateByPrimaryKey(admin);
        Assert.assertNotEquals(0, insert);
    }

    @Test
    public void insert() {
        Admin admin = new Admin();
        admin.setAno("a001");
        admin.setAname("admin");
        admin.setApassword("123456");
        admin.setAsex("男");
        admin.setAage(23);
        admin.setAcaddress("肇庆学院");
        admin.setAcphone("123456789");
        int insert = adminMapper.insert(admin);
        Assert.assertNotEquals(0, insert);
    }

    @Test
    public void selectByExample() {
       /* Admin admin = new Admin();
        admin.setAname("admin");
        admin.setApassword("123456");
        AdminExample example = new AdminExample();
        AdminExample.Criteria criteria = example.createCriteria();
        criteria.andAnameEqualTo(admin.getAname());
        criteria.andApasswordEqualTo(admin.getApassword());
        Assert.assertNotEquals(null,adminMapper.selectByExample(example));*/
        //System.out.println("*****************");
        Admin a001 = adminMapper.selectByPrimaryKey("a001");
        System.out.println(a001.toString());
    }

    @Test
    public void selectByAdmin() {
        Admin admin = new Admin();
        admin.setAname("admin");
        admin.setApassword("123456");
        Admin admin1 = adminMapper.selectByAdmin("admin", "123456");
        //System.out.println(admin1.toString());
        Assert.assertNotEquals(null,adminMapper.selectByAdmin("admin", "123456"));

    }

}