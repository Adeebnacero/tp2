package com.kabaso.domain;

/**
 * Created by hashcode on 2016/03/17.
 */
public class GradeC extends Grade{
    @Override
    public String handleRequest(int request) {
        if(request > 60 & request < 70){
            return "C";
        }else{
            if (nextGrade!=null) {
                return nextGrade.handleRequest(request);
            }
            return "No Grade";
        }
    }
}
