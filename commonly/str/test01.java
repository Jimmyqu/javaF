package javaF.commonly.str;

public class test01 {
    public static void main(String[] args) {
        char [] arr = {'a', 'b', 'c'};
        String s1 = "123";
        String s2 = new String("123"); // 不可变
        String s3 = new String(arr);
        System.out.printf(s3);
        s1.equals(s2);

        StringBuilder s4 = new StringBuilder(); // 可变 效率高 线程不安全
        s4.append("2");
        System.out.printf(s4.toString());

        StringBuilder s5 = new StringBuilder(); // 可变 效率低 线程安全
        s5.append("2");
        System.out.printf(s5.toString());
    }
}
