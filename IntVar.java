package javaF;

public class IntVar {
    public static void main(String [] args) {
        byte b1 = 122; // 最多1字节 8bit
        short s1 = 333; // 最多2字节
        int i1 = 333; // 最多4字节
        long l1 = 333; // 最多8字节 大数字默认是int类型　超出int最大值时 需要在数字后加L
        System.out.println(b1);
        System.out.println(s1);
        System.out.println(i1);
        System.out.println(l1);

    }
}
