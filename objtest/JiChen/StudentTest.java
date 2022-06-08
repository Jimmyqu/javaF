package javaF.objtest.JiChen;

public class StudentTest {
    public static void main (String [] args) {
        PersonJiChen p1 = new PersonJiChen("红", 18,  true);
        p1.getPersonInfo();

        Student s1 = new Student("明", 16,  true, "一小");
        s1.getPersonInfo();
    }
}