package javaF.objtest.FengZhuang;

public class PersonTest {
    public static void main (String [] args) {

        Person p1 = new Person("lily", 12, true);
//        System.out.println(Person.name); // 普通成员变量 无法直接从类名访问
//        System.out.println(Person.shoocl); // 静态可以
        Person p2 = new Person("lucy", 12, true);

        p2.setAge(55);
        p1.getAge();
        p2.getAge();

    }
}