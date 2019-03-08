package com.chen.medicine_mall.controller;

import com.chen.medicine_mall.pojo.Admin;
import com.chen.medicine_mall.service.AdminService;
import com.chen.medicine_mall.service.AgencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName AdminController
 * @Description TODO
 * @Author chen
 * @Data 2018/12/19 17:02
 * @Version 1.0
 **/
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AgencyService agencyService;

    @Autowired
    private AdminService adminService;

    /*个人信息表*/
    @PostMapping("/{id}")
    public String selectAdmin(@PathVariable("id") String ano, Model model){
        Admin admin = adminService.selectByPrimaryKey(ano);
        model.addAttribute("admin", admin);
        return null;
    }

    /* 更新个人信息*/
    @GetMapping(value = "/view")
    @ResponseBody
    Admin selectAdmin(String ano){
        System.out.println(ano);
        System.out.println(11111111);
        System.out.println("slrhtgklshglsni");
        System.out.println();
        return adminService.selectByAdmin("admin", "123456");

    }
}
