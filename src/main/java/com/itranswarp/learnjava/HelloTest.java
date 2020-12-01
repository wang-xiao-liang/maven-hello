package com.itranswarp.learnjava;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author wangxiaoliang
 * @version 1.0
 * @package PACKAGE_NAME
 * @date 2020/7/25 8:14
 * @description 测试
 */
public class HelloTest {

    public static void main(String[] args) {
        Set<Person> treeSet = new TreeSet<Person>();

        treeSet.add(new Person("Tom", 19));
        treeSet.add(new Person("jack", 20));
        treeSet.add(new Person("Rose", 18));
        System.out.println(treeSet);
    }

}

class Person {

    private String name;

    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "com.itranswarp.learnjava.Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}