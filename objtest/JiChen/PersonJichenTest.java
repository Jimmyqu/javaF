package javaF.objtest.JiChen;
import javaF.objtest.JiChen.PersonJiChen;

public class PersonJichenTest {
    public static void main (String [] args) {

        PersonJiChen p1 = new PersonJiChen("lily", 12, true);
//        System.out.println(Person.name); // 普通成员变量 无法直接从类名访问
//        System.out.println(Person.shoocl); // 静态可以
        PersonJiChen p2 = new PersonJiChen("lucy", 12, true);

        p1.getPersonInfo();
    }
}