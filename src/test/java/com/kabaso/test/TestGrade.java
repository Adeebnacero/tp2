package com.kabaso.test;

import com.kabaso.factories.GradeFactory;
import org.testng.annotations.Test;

/**
 * Created by hashcode on 2016/03/16.
 */
public class TestGrade {
    @Test
    public void testTestGrade() throws Exception {

        String grade = GradeFactory.getGrade(61);
        System.out.println("The Result is "+grade);

    }
}
