package com.chen.medicine_mall.controller;

import com.chen.medicine_mall.pojo.Agency;
import com.chen.medicine_mall.pojo.Sum;
import com.chen.medicine_mall.service.AdminService;
import com.chen.medicine_mall.service.AgencyService;
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
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * @ClassName AdminController
 * @Description TODO
 * @Author chen
 * @Data 2018/12/19 17:02
 * @Version 1.0
 **/
@Controller
@RequestMapping("/agency")
public class AgencyController {

    @Autowired
    private AgencyService agencyService;
    @Autowired
    private ClientService clientService;
    @Autowired
    private AdminService adminService;
    @Autowired
    private SumService sumService;
    /*注册*/
    public String insert(Agency agency, Model model){
        boolean insert = agencyService.insert(agency);
        if(insert){
            List<Agency> agencies = agencyService.selectByExample(agency);
            model.addAttribute("agency", agencies.get(0));
            System.out.println(agencies.get(0).toString());
            return "table";
        }
        return null;
    }
    @RequestMapping("/all/{cno}")
    public String selectAll(@PathVariable("cno") String cno, Model model){
        Agency agency = new Agency();
        List<Agency> agencies = agencyService.selectByExample(agency);
        agencies.forEach(i -> System.out.println(i.toString()));
        model.addAttribute("client", clientService.selectByCnot(cno));
        model.addAttribute("agencies", agencies);
        return "agencycontext";
    }

    @RequestMapping("/mall/all/{ano}")
    public String getAllClient(@PathVariable("ano") String ano, Model model){
        System.out.println(ano);
        System.out.println("*****ano******");
        model.addAttribute("agencies", agencyService.selectByExample(new Agency()));
        model.addAttribute("admin", adminService.selectByPrimaryKey(ano));
        return "admin/allagencycontext";
    }

    @RequestMapping("/mall/delete/{aano}/{ano}")
    public String deleteMedicine(@PathVariable("aano") String aano,@PathVariable("ano") String ano, Model model){
        System.out.println("*****药品信息删除******");
        System.out.println(aano);
        System.out.println(ano);
        Sum sum = new Sum();
        sum.setAno(aano);
        int i = sumService.deleteBySum(sum);
        System.out.println(i);
        int i1 = agencyService.deleteByAno(aano);
        System.out.println(i1);
        model.addAttribute("agencies", agencyService.selectByExample(new Agency()));
        model.addAttribute("admin", adminService.selectByPrimaryKey(ano));
        return "admin/allagencycontext";
    }

    @RequestMapping("/mall/update/{aano}/{ano}")
    public String getAllClient(@PathVariable("aano") String aano,@PathVariable("ano") String ano, Model model){
        System.out.println("*****客户信息更新******");
        model.addAttribute("agency", agencyService.selectByAno(aano));
        model.addAttribute("admin", adminService.selectByPrimaryKey(ano));
        return "admin/updateagencycontext";
    }
    /*/agency/updatemallagency*/
    @RequestMapping("/updatemallagency")
    public String updatemallagency(Agency agency,String adminno, Model model){
        System.out.println("*************经办人更新********");
        agencyService.updateByPrimaryKey(agency);
        System.out.println("更新成功");
        model.addAttribute("agencies", agencyService.selectByExample(new Agency()));
        model.addAttribute("admin", adminService.selectByPrimaryKey(adminno));
        return "admin/allagencycontext";
    }

    @RequestMapping("/mall/select")
    public String selectMallAgency(Agency agency, String adminno, Model model){
        System.out.println("*************药品查询********");

        model.addAttribute("agencies", agencyService.selectByExample(agency));
        model.addAttribute("admin", adminService.selectByPrimaryKey(adminno));
        return "admin/allagencycontext";
    }
    /*selectlike*/
    @RequestMapping("/mall/selectlike")
    public String selectLikeMallAgency(Agency agency, String adminno, Model model){
        System.out.println("*************药品模糊查询********");

        model.addAttribute("agencies", agencyService.selectLikeByExample(agency));
        model.addAttribute("admin", adminService.selectByPrimaryKey(adminno));
        return "admin/allagencycontext";
    }

    @RequestMapping("/mall/insertview/{ano}")
    public String insertMadicine(@PathVariable("ano") String ano, Model model){
        model.addAttribute("admin", adminService.selectByPrimaryKey(ano));
        return "admin/insertagencycontext";
    }
    @RequestMapping("/mall/insert/{ano}")
    public String insertmallAgency(Agency agency, @PathVariable("ano") String ano, Model model){
        Agency agency1 = agencyService.selectByAno(agency.getAno());
        if(agency1 != null){
            model.addAttribute("info", "该用户编号已存在");
            model.addAttribute("admin", adminService.selectByPrimaryKey(ano));
            return "admin/insertagencycontext";
        }
        agencyService.insert(agency);
        List<Agency> agencies = agencyService.selectByExample(new Agency());
        model.addAttribute("agencies", agencies);
        model.addAttribute("admin", adminService.selectByPrimaryKey(ano));
        return "admin/allagencycontext";
    }
    @RequestMapping("/buyrecord/all/{ano}")
    public String buyRecordAll(@PathVariable("ano") String ano, Model model){
        Sum sum = new Sum();
        sum.setAno("a001");
        List<Sum> sums = sumService.selectAllOrderBy(sum);
        model.addAttribute("sums", sums);
        model.addAttribute("admin", adminService.selectByPrimaryKey(ano));
        return "admin/mallagencycontext";
    }

    @RequestMapping(value="/checkdelete")
    @ResponseBody
    public String batchDeletes(@RequestParam("ids[]") String ids[]){
        System.out.println("*******************");
        Sum sum = new Sum();
        for (int i = 0; i < ids.length; i++) {
            sum.setAno(ids[i]);
            sumService.deleteBySum(sum);
            agencyService.deleteByAno(ids[i]);
        }
        System.out.println("********************");
        return "true";
    }

    /*/all/download*/
    @RequestMapping("/all/download")
    public void downloadAllClassmate(HttpServletResponse response) throws IOException {
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("信息表");

        Sum sum = new Sum();
        sum.setAno("a001");
        List<Sum> list = sumService.selectAllOrderBy(sum);

        String fileName = "agency"  + ".xls";//设置要导出的文件的名字
        //新增数据行，并且设置单元格数据

        int rowNum = 1;

        String[] headers = { "经办人编号", "经办人姓名", "经办人性别", "经办人电话", "经办人备注",
                "顾客编号", "顾客姓名", "顾客性别", "顾客年龄", "顾客住址","顾客电话",
                "顾客症状", "顾客录入日期", "药品编号", "药品名称","药品服用方法", "药品功效"
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
            row1.createCell(0).setCellValue(sum1.getAno());
            row1.createCell(1).setCellValue(sum1.getAname());
            row1.createCell(2).setCellValue(sum1.getAsex());
            row1.createCell(3).setCellValue(sum1.getAphone());
            row1.createCell(4).setCellValue(sum1.getAremark());
            row1.createCell(5).setCellValue(sum1.getCno());
            row1.createCell(6).setCellValue(sum1.getCname());
            row1.createCell(7).setCellValue(sum1.getCsex());
            row1.createCell(8).setCellValue(sum1.getCage());
            row1.createCell(9).setCellValue(sum1.getCaddress());
            row1.createCell(10).setCellValue(sum1.getCphone());
            row1.createCell(11).setCellValue(sum1.getCsymptom());
            row1.createCell(12).setCellValue(sdf.format(sum1.getCdate()));
            row1.createCell(13).setCellValue(sum1.getMno());
            row1.createCell(14).setCellValue(sum1.getMname());
            row1.createCell(15).setCellValue(sum1.getMmode());
            row1.createCell(16).setCellValue(sum1.getMefficacy());
            rowNum++;
        }
        response.setContentType("application/octet-stream");
        response.setHeader("Content-disposition", "attachment;filename=" + fileName);
        response.flushBuffer();
        workbook.write(response.getOutputStream());
    }

}
