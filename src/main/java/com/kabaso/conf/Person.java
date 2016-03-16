package com.kabaso.conf;

import java.util.Date;

/**
 * Created by hashcode on 2016/03/12.
 */
public class Person {
    private String name;
    private int age;
    private Date dob;
    private Person(){}

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Date getDob() {
        return dob;
    }

    public Person(Builder builder) {
        this.age=builder.age;
        this.name=builder.name;
        this.dob=builder.dob;
    }

    public static class Builder{
        private String name;
        private int age;
        private Date dob;

        public Builder name(String value){
            this.name=value;
            return this;
        }

        public Builder age(int value){
            this.age=value;
            return this;
        }

        public Builder dob(Date value){
            this.dob=value;
            return this;
        }

        public Builder copy(Person value){
            this.dob=value.dob;
            this.age=value.age;
            this.name=value.name;
            return this;
        }

        public Person build(){
            return new Person(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return age == person.age;

    }

    @Override
    public int hashCode() {
        return age;
    }
}
