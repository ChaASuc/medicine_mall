package com.chen.medicine_mall.service.imp;

import com.chen.medicine_mall.pojo.Medicine;
import com.chen.medicine_mall.service.MedicineService;
import com.chen.medicine_mall.utils.TestUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MedicineServiceImplTest extends TestUtils {

    @Autowired
    private MedicineService medicineService;

    @Test
    public void selectByMedicine() {
        Medicine medicine = new Medicine();
        medicineService.selectByMedicine(medicine)
                .forEach(i -> System.out.println(i.toString()));
//        Medicine medicine1 = medicineService.selectByMedicine(medicine);
//        System.out.println(medicine1.toString());
    }
}