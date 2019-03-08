package com.chen.medicine_mall.service.imp;

import com.chen.medicine_mall.pojo.Agency;
import com.chen.medicine_mall.service.AgencyService;
import com.chen.medicine_mall.utils.TestUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AgencyServiceImplTest extends TestUtils {

    @Autowired
    private AgencyService agencyService;
    @Test
    public void updateByPrimaryKey() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void selectByExample() {
        Agency agency = new Agency();
        agency.setAno("a001");
        List<Agency> agencies = agencyService.selectByExample(agency);
        agencies.forEach(i -> System.out.println(i.toString()));
    }

    @Test
    public void selectByAgency() {
    }
}