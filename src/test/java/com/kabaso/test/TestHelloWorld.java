package com.kabaso.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by hashcode on 2016/02/29.
 */
public class TestHelloWorld {

    private HelloWorld h;

    @Before
    public void setUp() throws Exception {
        System.out.println("Run The Test ");
         h =  new HelloWorld();


    }

    @Test
    public void testHelloWorld() throws Exception {

        String result = h.getResult();

        Assert.assertEquals("Hell World", result);

    }

    @Test
    public void testAddNumbers() throws Exception {

        double result = h.add(1.0,6.0);

        Assert.assertEquals(7.0, result);



    }
}
