package javaF.objtest;

import java.util.ArrayList;

public class Test {
    public static void main (String [] args) {

        Person p1 = new Person("lily", 12, true);
//        System.out.println(Person.name); // 普通成员变量 无法直接从类名访问
//        System.out.println(Person.shoocl); // 静态可以

        p1.showAge();
    }
}