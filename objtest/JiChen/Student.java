package javaF.objtest.JiChen;

public class Student extends PersonJiChen {
    public String school;

    public Student(String name, int age, Boolean sex, String school) {
        super(name, age, sex);
        this.school = school;
    }

    public void getPersonInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.sex);
    }
}