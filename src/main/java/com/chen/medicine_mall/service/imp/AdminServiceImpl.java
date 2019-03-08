package com.chen.medicine_mall.service.imp;

import com.chen.medicine_mall.mapper.AdminMapper;
import com.chen.medicine_mall.pojo.Admin;
import com.chen.medicine_mall.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName AdminServiceImpl
 * @Description 事务逻辑处理
 * @Author chen
 * @Data 2018/12/19 16:46
 * @Version 1.0
 **/
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;
    /*用户注册处理*/
    @Override
    public boolean updateByPrimaryKey(Admin man) {
        return adminMapper.updateByPrimaryKey(man) > 0 ? true: false;
    }

    @Override
    public boolean insert(Admin man) {
        return adminMapper.insert(man) > 0 ? true: false;
    }

   /* @Override
    public List<Admin> selectByExample(Admin admin) {
        AdminExample adminExample = new AdminExample();
        AdminExample.Criteria criteria = adminExample.createCriteria();
        return adminMapper.selectByExample(adminExample);
    }*/

    @Override
    public Admin selectByPrimaryKey(String ano) {
        return adminMapper.selectByPrimaryKey(ano);
    }

    @Override
    public Admin selectByAdmin(String name, String passoword) {
        return adminMapper.selectByAdmin(name, passoword);
    }
}
