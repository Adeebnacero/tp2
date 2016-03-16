package com.kabaso.domain;

/**
 * Created by hashcode on 2016/03/16.
 */
public abstract  class Grade {
    Grade nextGrade;

    public void setNextGrade(Grade nextGrade) {
        this.nextGrade = nextGrade;
    }
    public abstract String handleRequest(int request);

}
