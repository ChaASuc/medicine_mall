package com.chen.medicine_mall.controller;

import com.chen.medicine_mall.pojo.*;
import com.chen.medicine_mall.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @ClassName SumController
 * @Description TODO
 * @Author chen
 * @Data 2018/12/19 17:02
 * @Version 1.0
 **/
@Controller
@RequestMapping("/admin")
public class AdminMallController {

    @Autowired
    private AdminService adminService;
    @Autowired
    private AgencyService agencyService;
    @Autowired
    private ClientService clientService;
    @Autowired
    private SumService sumService;
    @Autowired
    private MedicineService medicineService;

    /*登入界面*//*
    @RequestMapping("/view")
    public String loginView(){
        System.out.println("111111111111111111");
        return "login";
    }


    @RequestMapping("/member")
    public String select(String name, String password, Model model){
        Admin admin = adminService.selectByAdmin(name, password);
        Agency agency = agencyService.selectByAgency(name, password);
        Client client = clientService.selectByClient(name, password);
        if(admin != null) {
            model.addAttribute("admin", admin);
            System.out.println("754545415842");
            return "admin/table";
        }
        if(agency != null) {
            model.addAttribute("agency", agency);
            return null;
        }
        if(client != null) {
            model.addAttribute("client", client);
            return "clientcontext";
        }
        model.addAttribute("info", "该用户名不存在");
        return "login";
    }*/

    /*跳转注册页面*/
    @RequestMapping("/clientview")
    public String clientregister(){
        return "client_register";
    }

    /*跳转注册页面*/
    @RequestMapping("/agencyview")
    public String agencyregister(){
        return "agency_register";
    }

    /*跳转购买药品页面*/
    @RequestMapping("/mall/{cno}")
    public String mallview(@PathVariable("cno")String cno, Model model){
        System.out.println(cno+"你试试看能否力克斯洛伐克算了");
        Sum sum = new Sum();
        sum.setCno(cno);
        List<Sum> sums = sumService.selectByNo(sum);
        sums.forEach(i -> System.out.println(i.toString()));
        model.addAttribute("client", clientService.selectByCnot(cno));
        model.addAttribute("sums", sums);
//        System.out.println(clientService.selectByCnot(cno).toString());
        return "mallcontext";
    }
    /*跳转购买药品页面*/
    @RequestMapping("/mall/insert")
    public String insertMall(Sum sum, Model model){
        System.out.println("dfgdgdfgfd");
        Agency agency = agencyService.selectByAname(sum.getAname());
        sum.setAno(agency.getAno());
        Medicine medicine = medicineService.selectByMname(sum.getMname());
        sum.setMno(medicine.getMno());
        boolean insert = sumService.insert(sum);
        List<Sum> sums = sumService.selectByCno(sum);
        sums.forEach(i -> System.out.println(i.toString()));
        model.addAttribute("client", clientService.selectByCnot(sum.getCno()));
        model.addAttribute("sums", sums);
//        System.out.println(clientService.selectByCnot(cno).toString());
        return "mallcontext";
    }
    /*跳转购买药品页面*/
    @RequestMapping("/updatemall")
    public String updateClientMall(Sum sum, Model model){
        Client client = new Client();
        client.setCno(sum.getCno());
        client.setCname(sum.getCname());
        client.setCage(sum.getCage());
        client.setCsex(sum.getCsex());
        client.setCdate(sum.getCdate());
        client.setCphone(sum.getCphone());
        client.setCaddress(sum.getCaddress());
        client.setCsymptom(sum.getCsymptom());
        clientService.updateByPrimaryKeySelective(client);

        Agency agency = agencyService.selectByAname(sum.getAname());
        Medicine medicine = medicineService.selectByMname(sum.getMname());
        List<Sum> sums = sumService.UpdateMall(sum, client, agency, medicine);

        model.addAttribute("client", clientService.selectByCnot(sum.getCno()));
        model.addAttribute("sums", sums);
        return "mallcontext";
    }

    /*跳转购买药品页面*/
    @RequestMapping("/mall/delete/{cno}/{ano}/{mno}")
    public String deletemall(@PathVariable("cno")String cno, @PathVariable("ano")String ano,
                             @PathVariable("mno")String mno, Model model){
        System.out.println(cno+"十多个发生了附近");
        int i1 = sumService.deleteByCnoAnoMno(cno, ano, mno);
        if(i1 > 0){
            Sum sum = new Sum();
            sum.setCno(cno);
            List<Sum> sums = sumService.selectByNo(sum);
            model.addAttribute("client", clientService.selectByCnot(cno));
            model.addAttribute("sums", sums);
            return "mallcontext";
        }
        System.out.println("删除失败");
//        System.out.println(clientService.selectByCnot(cno).toString());
        return null;
    }
    /*跳转购买药品页面*/
    @RequestMapping("/mall/update/{cno}/{ano}/{mno}")
    public String updatemall(@PathVariable("cno")String cno, @PathVariable("ano")String ano,
                             @PathVariable("mno")String mno, Model model){
        System.out.println(cno+"十多个发生了附近");
        Client client = clientService.selectByCnot(cno);
        Agency agency = agencyService.selectByAno(ano);
        Medicine medicine = medicineService.selectByMno(mno);
        model.addAttribute("client", client);
        model.addAttribute("agency", agency);
        model.addAttribute("medicine", medicine);
//        System.out.println(clientService.selectByCnot(cno).toString());
        return "updateclientmallcontext";
    }
    /*跳转购买药品页面*/
    @RequestMapping("/mall/buy/{cno}")
    public String buyMall(@PathVariable("cno")String cno, Model model){
        Client client = clientService.selectByCnot(cno);
        model.addAttribute("client", client);
//        System.out.println(clientService.selectByCnot(cno).toString());
        return "buyclientmallcontext";
    }

    /*/login/mall/select*/
    /*跳转购买药品页面*/
    @RequestMapping("/mall/select")
    public String selectOneMall(Sum sum, Model model){
        System.out.println("fdklnglsngdl");
        List<Sum> sums = sumService.selectByOne(sum);
        System.out.println(sum.toString());
        model.addAttribute("client", clientService.selectByCnot(sum.getCno()));
        model.addAttribute("sums", sums);
        return "mallcontext";
//
    }
    @RequestMapping("/mall/selectlike")
    public String selectOneMallLike(Sum sum, Model model){
        System.out.println("sdgdgdfdklnglsngdl");

        List<Sum> sums = sumService.selectLikeByOne(sum);
        sums.forEach(i -> System.out.println(i.toString()));
        model.addAttribute("client", clientService.selectByCnot(sum.getCno()));
        model.addAttribute("sums", sums);
        return "mallcontext";
//
    }
    @RequestMapping("/mall/test")
    public String test(Model model){
        return "admin/context1";
//
    }
    /*@GetMapping(value = "/view")
    @ResponseBody  List<Admin> selectAdmin(String ano){
        System.out.println(ano);
        System.out.println(11111111);
        System.out.println("slrhtgklshglsni");
        System.out.println();
        return adminService.selectByExample(admin);

    }*/
}
