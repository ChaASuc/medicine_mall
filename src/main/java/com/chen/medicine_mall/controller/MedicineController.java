package com.chen.medicine_mall.controller;

import com.chen.medicine_mall.pojo.Medicine;
import com.chen.medicine_mall.pojo.Sum;
import com.chen.medicine_mall.service.AdminService;
import com.chen.medicine_mall.service.ClientService;
import com.chen.medicine_mall.service.MedicineService;
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
 * @ClassName MedicineController
 * @Description TODO
 * @Author chen
 * @Data 2018/12/19 17:02
 * @Version 1.0
 **/
@Controller
@RequestMapping("/medicine")
public class MedicineController {

    @Autowired
    private MedicineService medicineService;
    @Autowired
    private ClientService clientService;
    @Autowired
    private AdminService adminService;
    @Autowired
    private SumService sumService;

    @RequestMapping("/all/{cno}")
    public String selectAll(@PathVariable("cno") String cno, Model model){
        Medicine medicine = new Medicine();
        List<Medicine> medicines = medicineService.selectByMedicine(medicine);
        medicines.forEach(i -> System.out.println(i.toString()));
        model.addAttribute("client", clientService.selectByCnot(cno));
        model.addAttribute("medicines", medicines);
        return "medicinecontext";
    }
    @RequestMapping("/mall/all/{ano}")
    public String getAllClient(@PathVariable("ano") String ano, Model model){
        System.out.println(ano);
        System.out.println("*****ano******");
        model.addAttribute("medicines", medicineService.selectByExample(new Medicine()));
        model.addAttribute("admin", adminService.selectByPrimaryKey(ano));
        return "admin/allmedicinecontext";
    }

    @RequestMapping("/mall/delete/{mno}/{ano}")
    public String deleteMedicine(@PathVariable("mno") String mno,@PathVariable("ano") String ano, Model model){
        System.out.println("*****药品信息删除******");
        Sum sum = new Sum();
        sum.setMno(mno);
        int i = sumService.deleteBySum(sum);
        System.out.println(i);
        int i1 = medicineService.deleteByMno(mno);
        System.out.println(i1);
        model.addAttribute("medicines", medicineService.selectByExample(new Medicine()));
        model.addAttribute("admin", adminService.selectByPrimaryKey(ano));
        return "admin/allmedicinecontext";
    }

    @RequestMapping("/mall/update/{mno}/{ano}")
    public String getAllClient(@PathVariable("mno") String mno,@PathVariable("ano") String ano, Model model){
        System.out.println("*****客户信息更新******");
        model.addAttribute("medicine", medicineService.selectByMno(mno));
        model.addAttribute("admin", adminService.selectByPrimaryKey(ano));
        return "admin/updatemedicinecontext";
    }

    @RequestMapping("/mall/updatemall")
    public String updatemallmedicine(Medicine medicine, String ano, Model model){
        System.out.println("*************药品更新********");
        medicineService.updateByPrimaryKey(medicine);
        System.out.println("更新成功");
        model.addAttribute("medicines", medicineService.selectByExample(new Medicine()));
        model.addAttribute("admin", adminService.selectByPrimaryKey(ano));
        return "admin/allmedicinecontext";
    }

    @RequestMapping("/mall/select")
    public String selectMallClient(Medicine medicine, String ano, Model model){
        System.out.println("*************药品查询********");
        System.out.println(medicine.toString());
        model.addAttribute("medicines", medicineService.selectByExample(medicine));
        model.addAttribute("admin", adminService.selectByPrimaryKey(ano));
        return "admin/allmedicinecontext";
    }
    /*selectlike*/
    @RequestMapping("/mall/selectlike")
    public String selectLikeMallClient(Medicine medicine, String ano, Model model){
        System.out.println("*************药品模糊查询********");
        System.out.println(ano);

        model.addAttribute("medicines", medicineService.selectLikeByExample(medicine));
        model.addAttribute("admin", adminService.selectByPrimaryKey(ano));
        return "admin/allmedicinecontext";
    }

    @RequestMapping("/mall/insertview/{ano}")
    public String insertMadicine(@PathVariable("ano") String ano, Model model){
        model.addAttribute("admin", adminService.selectByPrimaryKey(ano));
        return "admin/insertmedicinecontext";
    }

    @RequestMapping("/mall/insert/{ano}")
    public String insertmallmedicine(Medicine medicine, @PathVariable("ano") String ano, Model model){
        Medicine medicine1 = medicineService.selectByMno(medicine.getMno());
        if(medicine1 != null){
            model.addAttribute("info", "该药品编号已存在");
            model.addAttribute("admin", adminService.selectByPrimaryKey(ano));
            return "admin/insertmedicinecontext";
        }
        medicineService.insert(medicine);
        model.addAttribute("medicines", medicineService.selectByExample(new Medicine()));
        model.addAttribute("admin", adminService.selectByPrimaryKey(ano));
        return "admin/allmedicinecontext";
    }
    @RequestMapping("/buyrecord/all/{ano}")
    public String buyRecordAll(@PathVariable("ano") String ano, Model model){
        Sum sum = new Sum();
        sum.setMno("m001");
        List<Sum> sums = sumService.selectAllOrderBy(sum);
        model.addAttribute("sums", sums);
        model.addAttribute("admin", adminService.selectByPrimaryKey(ano));
        return "admin/mallmedicinecontext";
    }
    @RequestMapping("/all/download")
    public void downloadAllClassmate(HttpServletResponse response) throws IOException {
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("信息表");

        Sum sum = new Sum();
        sum.setMno("m001");
        List<Sum> list = sumService.selectAllOrderBy(sum);

        String fileName = "medicine"  + ".xls";//设置要导出的文件的名字
        //新增数据行，并且设置单元格数据

        int rowNum = 1;

        String[] headers = { "药品编号", "药品名称","药品服用方法", "药品功效",
                "顾客编号", "顾客姓名", "顾客性别", "顾客年龄", "顾客住址","顾客电话",
                "顾客症状", "顾客录入日期", "经办人编号", "经办人姓名", "经办人性别", "经办人电话", "经办人备注"
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
            row1.createCell(0).setCellValue(sum1.getMno());
            row1.createCell(1).setCellValue(sum1.getMname());
            row1.createCell(2).setCellValue(sum1.getMmode());
            row1.createCell(3).setCellValue(sum1.getMefficacy());
            row1.createCell(4).setCellValue(sum1.getCno());
            row1.createCell(5).setCellValue(sum1.getCname());
            row1.createCell(6).setCellValue(sum1.getCsex());
            row1.createCell(7).setCellValue(sum1.getCage());
            row1.createCell(8).setCellValue(sum1.getCaddress());
            row1.createCell(9).setCellValue(sum1.getCphone());
            row1.createCell(10).setCellValue(sum1.getCsymptom());
            row1.createCell(11).setCellValue(sdf.format(sum1.getCdate()));
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

    @RequestMapping(value="/checkdelete")
    @ResponseBody
    public String batchDeletes(@RequestParam("ids[]") String ids[]){
        System.out.println("*******************");
        Sum sum = new Sum();
        for (int i = 0; i < ids.length; i++) {
            sum.setMno(ids[i]);
            sumService.deleteBySum(sum);
            medicineService.deleteByMno(ids[i]);
        }
        System.out.println("********************");
        return "true";
    }
   /* @RequestMapping("/insert")
    public String insert(, Model model){
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
    @RequestMapping("/{cno}")
    public String info(@PathVariable("cno") String cno, Model model){
        System.out.println(cno+"lhdfglsdjlfsjdlfjls");
        model.addAttribute("client", clientService.selectByCnot(cno));
        System.out.println(clientService.selectByCnot(cno).toString());
        return "clientcontext";
    }*/
    /*@RequestMapping("/test")
    public String test(Model model){
        Client client = new Client();
        client.setCno("c001");
        List<Client> clients = clientService.selectByExample(client);
        model.addAttribute("client", clients.get(0));
        return "clientcontext";
    }*/

   /* @GetMapping
    @RequestMapping("login")
    public String selectMedicine(Medicine Medicine, @PathVariable("aage") int age){
        Medicine.setAage(age);
        MedicineService.selectByExample(Medicine);
        return null;
    }
    @GetMapping(value = "/view")
    @ResponseBody
    List<Medicine> selectMedicine(String ano){
        System.out.println(ano);
        System.out.println(11111111);
        System.out.println("slrhtgklshglsni");
        System.out.println();
        return MedicineService.selectByExample(Medicine);

    }*/
}
