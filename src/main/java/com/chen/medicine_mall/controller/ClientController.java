package com.chen.medicine_mall.controller;

import com.chen.medicine_mall.pojo.Admin;
import com.chen.medicine_mall.pojo.Client;
import com.chen.medicine_mall.pojo.Sum;
import com.chen.medicine_mall.service.AdminService;
import com.chen.medicine_mall.service.ClientService;
import com.chen.medicine_mall.service.SumService;
import org.apache.poi.hssf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @ClassName AdminController
 * @Description TODO
 * @Author chen
 * @Data 2018/12/19 17:02
 * @Version 1.0
 **/
@Controller
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;
    @Autowired
    private AdminService adminService;
    @Autowired
    private SumService sumService;

    @RequestMapping("/insert")
    public String insert(Client client, Model model){
        System.out.println(client.toString());
        boolean insert = clientService.insert(client);
        if(insert){
            System.out.println("添加成功");
            model.addAttribute("client", client);
            return "clientcontext";
        }
        System.out.println("添加失败");
        model.addAttribute("info", "顾客信息添加失败");
        return "login";
    }
    @RequestMapping("/mall/insertview/{ano}")
    public String insertview(@PathVariable("ano") String ano, Model model){
        model.addAttribute("admin", adminService.selectByPrimaryKey(ano));
        return "admin/insertclientcontext";
    }
    @RequestMapping("/mall/insert/{ano}")
    public String insertmallclient(Client client, @PathVariable("ano") String ano, Model model){
        Client client1 = clientService.selectByCnot(client.getCno());
        if(client1 != null){
            model.addAttribute("info", "该用户编号已存在");
            model.addAttribute("admin", adminService.selectByPrimaryKey(ano));
            return "admin/insertclientcontext";
        }
        clientService.insert(client);
        List<Client> clients = clientService.selectByExample(new Client());
        clients.forEach(i -> System.out.println(i.toString()));
        model.addAttribute("clients", clients);
        model.addAttribute("admin", adminService.selectByPrimaryKey(ano));
        return "admin/allclientcontext";
    }
    @RequestMapping("/{cno}")
    public String info(@PathVariable("cno") String cno, Model model){
        model.addAttribute("client", clientService.selectByCnot(cno));
        System.out.println(clientService.selectByCnot(cno).toString());
        return "clientcontext";
    }
    @RequestMapping("/update/{cno}")
    public String update(@PathVariable("cno") String cno, Model model){
        System.out.println(cno+"lhdfglsdjlfsjdlfjls");
        model.addAttribute("client", clientService.selectByCnot(cno));
        System.out.println(clientService.selectByCnot(cno).toString());
        return "updateclientcontext";
    }
    @RequestMapping("/updateclient")
    public String updateclient(Client client, Model model){
        System.out.println(client.toString());
        boolean b = clientService.updateByPrimaryKey(client);
        System.out.println(b);
        if(b){
            System.out.println("更新成功");
            model.addAttribute("client", clientService.selectByCnot(client.getCno()));
            return "clientcontext";
        }
        System.out.println("更新失败");
        System.out.println("更新失败");
        System.out.println();
        model.addAttribute("info", "更新失败");
        return "updateclientcontext";
    }

    @RequestMapping("/updatemallclient")
    public String updatemallclient(Client client, String ano, Model model){
        System.out.println(client.toString());
        System.out.println("*************顾客测试********");
        boolean b = clientService.updateByPrimaryKey(client);
        System.out.println(b);
        System.out.println("更新成功");
        model.addAttribute("clients", clientService.selectByExample(new Client()));
        model.addAttribute("admin", adminService.selectByPrimaryKey(ano));
        return "admin/allclientcontext";
    }
    /*//*client/buyrecord/all/*/
    @RequestMapping("/buyrecord/all/{ano}")
    public String buyRecordAll(@PathVariable("ano") String ano, Model model){
        Sum sum = new Sum();
        sum.setCno("c001");
        List<Sum> sums = sumService.selectAllOrderBy(sum);
        model.addAttribute("sums", sums);
        model.addAttribute("admin", adminService.selectByPrimaryKey(ano));
        return "admin/mallclientcontext";
    }
    /*@RequestMapping("/mall/select")
    public void selectMallClient(@RequestParam("cno") String cno, @RequestParam("cname") String cname, @RequestParam("csex") String csex,
                                   @RequestParam("cage") String cage,@RequestParam("caddress") String caddress,@RequestParam("cphone") String cphone,
                                   @RequestParam("csymptom") String csymptom, @RequestParam("cdate") String cdate, @RequestParam("ano") String ano, Model model){
        System.out.println("*************顾客查询********");
        Client client = new Client();
        client.setCno(cno);
        client.setCname(cname);
        client.setCsex(csex);
        client.setCaddress(caddress);
        client.setCphone(cphone);
        client.setCsymptom(csymptom);
        if(cage != null && cage != ""){
            client.setCage(Integer.parseInt(cage));
        }
        client.setCage(null);
        if(cdate != null && cdate != ""){
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = null;
            try {
                date = simpleDateFormat.parse(cdate);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
            client.setCdate(sqlDate);
        }
        client.setCdate(null);
        System.out.println(client.toString());
        List<Client> clients = clientService.selectByClient(client);
        clients.forEach(i -> System.out.println(i.toString()));
        *//*model.addAttribute("clients", clients);
//        model.addAttribute("admin", adminService.selectByPrimaryKey(ano));
        return "admin/allclientcontext";*//*
    }*/

    /*单多条件查询*/
    @RequestMapping("/mall/select")
    public String selectMallClient(Client client, @RequestParam("trdate") String trdate, @RequestParam("ano") String ano, Model model){
        System.out.println("*************顾客查询********");
        System.out.println(ano);
        System.out.println(trdate);
        if(trdate != null && trdate != ""){
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = null;
            try {
                date = simpleDateFormat.parse(trdate);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
            client.setCdate(sqlDate);
        }else {

            client.setCdate(null);
        }
        System.out.println(client.toString());
        List<Client> clients = clientService.selectByClient(client);
        clients.forEach(i -> System.out.println(i.toString()));
        model.addAttribute("clients", clients);
        model.addAttribute("admin", adminService.selectByPrimaryKey(ano));
        return "admin/allclientcontext";
    }


    /*单多条件模糊查询*/
    @RequestMapping("/mall/selectlike")
    public String selectLikeMallClient(Client client, @RequestParam("trdate") String trdate, @RequestParam("ano") String ano, Model model){
        if(trdate != null && trdate != ""){
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = null;
            try {
                date = simpleDateFormat.parse(trdate);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
            client.setCdate(sqlDate);
        }else {
            client.setCdate(null);
        }
        System.out.println(client.toString());
        List<Client> clients = clientService.selectByExample(client);
        model.addAttribute("clients", clients);
        model.addAttribute("admin", adminService.selectByPrimaryKey(ano));
        return "admin/allclientcontext";
    }

    @RequestMapping("/mall/all/{ano}")
    public String getAllClient(@PathVariable("ano") String ano, Model model){
        System.out.println(ano);
        Client client = new Client();
        List<Client> clients = clientService.selectByExample(client);
        clients.forEach(i -> System.out.println(i.toString()));
        Admin admin = adminService.selectByPrimaryKey(ano);
        System.out.println(admin.toString());
        model.addAttribute("clients", clients);
        model.addAttribute("admin", admin);
        return "admin/allclientcontext";
    }

    @RequestMapping("/mall/update/{cno}/{ano}")
    public String getAllClient(@PathVariable("cno") String cno,@PathVariable("ano") String ano, Model model){
        System.out.println("*****客户信息更新******");
        Client client = clientService.selectByCnot(cno);
        Admin admin = adminService.selectByPrimaryKey(ano);
        model.addAttribute("client", client);
        model.addAttribute("admin", admin);
        return "admin/updateclientcontext";
    }
    @RequestMapping("/mall/delete/{cno}/{ano}")
    public String deleteClient(@PathVariable("cno") String cno,@PathVariable("ano") String ano, Model model){
        System.out.println("*****客户信息删除******");
        Sum sum = new Sum();
        sum.setCno(cno);
        int i = sumService.deleteBySum(sum);
        System.out.println(i);
        int i1 = clientService.deleteByCno(cno);
        System.out.println(i1);
        List<Client> clients = clientService.selectByExample(new Client());
        Admin admin = adminService.selectByPrimaryKey(ano);
        model.addAttribute("clients", clients);
        model.addAttribute("admin", admin);
        return "admin/allclientcontext";
    }
    @RequestMapping("/test")
    public void test(Sum sum){
        System.out.println("你好");
        System.out.println(sum.toString());
        /*Client client = new Client();
        client.setCno("c001");
        List<Client> clients = clientService.selectByExample(client);
        model.addAttribute("client", clients.get(0));
        return "clientcontext";*/
    }

    @RequestMapping(value="/checkdelete")
    @ResponseBody
    public String batchDeletes(@RequestParam("ids[]") String ids[]){
        System.out.println("*******************");
        Sum sum = new Sum();
        for (int i = 0; i < ids.length; i++) {
            sum.setCno(ids[i]);
            sumService.deleteBySum(sum);
            clientService.deleteByCno(ids[i]);
        }
        System.out.println("********************");
        return "true";
    }


    @RequestMapping("/all/download")
    public void downloadAllClassmate(HttpServletResponse response) throws IOException {
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("信息表");

        Sum sum = new Sum();
        sum.setCno("c001");
        List<Sum> list = sumService.selectAllOrderBy(sum);

        String fileName = "client"  + ".xls";//设置要导出的文件的名字
        //新增数据行，并且设置单元格数据

        int rowNum = 1;

        String[] headers = { "顾客编号", "顾客姓名", "顾客性别", "顾客年龄", "顾客住址","顾客电话",
                "顾客症状", "顾客录入日期","经办人编号", "经办人姓名", "药品编号", "药品名称","药品服用方法", "药品功效",
                "经办人性别", "经办人电话", "经办人备注",

        };
        //headers表示excel表中第一行的表头

        HSSFRow row = sheet.createRow(0);
        //在excel表中添加表头

        for(int i=0;i<headers.length;i++){
            HSSFCell cell = row.createCell(i);
            HSSFRichTextString text = new HSSFRichTextString(headers[i]);
            cell.setCellValue(text);
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        //在表中存放查询到的数据放入对应的列
        for (Sum sum1 : list) {
            HSSFRow row1 = sheet.createRow(rowNum);
            row1.createCell(0).setCellValue(sum1.getCno());
            row1.createCell(1).setCellValue(sum1.getCname());
            row1.createCell(2).setCellValue(sum1.getCsex());
            row1.createCell(3).setCellValue(sum1.getCage());
            row1.createCell(4).setCellValue(sum1.getCaddress());
            row1.createCell(5).setCellValue(sum1.getCphone());
            row1.createCell(6).setCellValue(sum1.getCsymptom());
            row1.createCell(7).setCellValue(sdf.format(sum1.getCdate()));


            row1.createCell(8).setCellValue(sum1.getMno());
            row1.createCell(9).setCellValue(sum1.getMname());
            row1.createCell(10).setCellValue(sum1.getMmode());
            row1.createCell(11).setCellValue(sum1.getMefficacy());

            row1.createCell(12).setCellValue(sum1.getAno());
            row1.createCell(13).setCellValue(sum1.getAname());
            row1.createCell(14).setCellValue(sum1.getAsex());
            row1.createCell(15).setCellValue(sum1.getAphone());
            row1.createCell(16).setCellValue(sum1.getAremark());
            rowNum++;
        }
        response.setContentType("application/octet-stream");
        response.setHeader("Content-disposition", "attachment;filename=" + fileName);
        response.flushBuffer();
        workbook.write(response.getOutputStream());
    }


   /* @GetMapping
    @RequestMapping("login")
    public String selectAdmin(Admin admin, @PathVariable("aage") int age){
        admin.setAage(age);
        adminService.selectByExample(admin);
        return null;
    }
    @GetMapping(value = "/view")
    @ResponseBody
    List<Admin> selectAdmin(String ano){
        System.out.println(ano);
        System.out.println(11111111);
        System.out.println("slrhtgklshglsni");
        System.out.println();
        return adminService.selectByExample(admin);

    }*/
}
