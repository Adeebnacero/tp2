package com.kabaso.test;

import org.springframework.context.annotation.Bean;

/**
 * Created by hashcode on 2016/02/29.
 */

public class HelloWorld {
    @Bean(name="calc")
    public String getResult() {
        return  "Hello World";
    }

    public double add(double a, double b) {
        return a+b;
    }
}
