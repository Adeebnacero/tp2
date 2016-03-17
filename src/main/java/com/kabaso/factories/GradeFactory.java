package com.kabaso.factories;

import com.kabaso.domain.Grade;
import com.kabaso.domain.GradeA;
import com.kabaso.domain.GradeB;
import com.kabaso.domain.GradeC;

/**
 * Created by hashcode on 2016/03/16.
 */
public class GradeFactory {

    public static String getGrade(int value){
        Grade chain = setUpChain();
        return chain.handleRequest(value);
    }

    public static Grade setUpChain(){
        Grade a = new GradeA();
        Grade b = new GradeB();
        Grade c = new GradeC();
        a.setNextGrade(b);
        b.setNextGrade(c);
        return a;
    }
}
