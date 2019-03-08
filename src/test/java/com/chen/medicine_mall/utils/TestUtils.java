package com.chen.medicine_mall.utils;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName TestUtils
 * @Description 测试类工具
 * @Author chen
 * @Data 2018/12/15 21:02
 * @Version 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
//由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
public class TestUtils {
    @Before
    public void init() {
        System.out.println("开始测试-----------------");
    }

    @After
    public void after() {
        //System.out.println("测试结束-----------------");
    }
}
