package javaF;

public class ChrVar {
    public static void main(String [] args) {
        char c1 ='1';
        char c2 ='以';
        char c3 =' ';
//        char c4 ='阿斯顿';
//        char(字符)类型是单引号中的单字符 2字符都不行
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
//        System.out.println(c4);
        char c5 = 'A';
        System.out.println(c5 + 90); // 底层计算是以unicode 来算 65+90

        int n1 = '将'; // 赋值单字符 不报错. 以unicode赋值
        System.out.println(n1);
    }
}
