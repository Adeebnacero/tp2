package com.kabaso.test;

import com.kabaso.conf.Person;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Date;

/**
 * Created by hashcode on 2016/03/12.
 */
public class PersonTest {
    @Test
    public void testPerson() throws Exception {

        Person person = new Person.Builder()
                .age(10)
                .name("jon")
                .dob(new Date())
                .build();

        Assert.assertEquals(person.getAge(),10);

        Person newPerson = new Person.Builder()
                .copy(person)
                .name("Luke").build();

        Assert.assertEquals(newPerson.getAge(),10);

        Assert.assertEquals(newPerson.getName(),"Luke");






    }
}
