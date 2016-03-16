package com.kabaso.conf;

import java.util.Date;

/**
 * Created by hashcode on 2016/03/12.
 */
public class Test {
    Person person = new Person.Builder()
            .age(10)
            .name("jon")
            .dob(new Date())
            .build();

}
