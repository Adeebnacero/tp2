package com.kabaso.domain;

/**
 * Created by hashcode on 2016/03/16.
 */
public class GradeB extends Grade{
    @Override
    public String handleRequest(int request) {
        if(request > 70 & request < 75){
            return "B";
        }else{
            if (nextGrade!=null) {
                return nextGrade.handleRequest(request);
            }
            return "No Grade";
        }
    }
}
