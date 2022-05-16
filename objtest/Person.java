package javaF.objtest;

public class Person {
    // 成员变量
    public int age;
    public String name;
    public Boolean sex;
    // 静态成员
    static String shoocl = "一办小学";


    // 重载 让 new Person() 不带参数可用
    public Person() {}

    public Person(String name, int age, Boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void showAge() {
        System.out.print(this.age);
    }
}
