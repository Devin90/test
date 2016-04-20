package com.weimob.dubbo;

import java.io.Serializable;

/**
 * Created by Devin on 4/14/2016.
 */
public class User implements Serializable {

    private static final long serialVersionUID = 4997538519893740198L;
    private String name;
    private Integer age;
    private String sex;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
