package com.kabaso.test;

import com.kabaso.conf.AppConfig;
import com.kabaso.domain.ElectricityData;
import com.kabaso.services.ElectricityService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by hashcode on 2016/03/07.
 */
public class ElectricityTest {
    private ElectricityService service;
    @BeforeMethod
    public void setUp() throws Exception {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        service = (ElectricityService)ctx.getBean("gen");
    }

    @Test
    public void testElectricity() throws Exception {
        ElectricityData data = service.getElectricity();
        System.out.println(" The Source is "+service.getElectricity().getSource());
        Assert.assertEquals(data.getFreq(),55);

    }
}
