package javaF;

public class FloatVar {
    public static void main(String [] args) {
        float f1 = 1.3f; // 最多4字节 底层实现不同 实际可表示数值大于 同样是4字节的 int
        double d1 = 0.0000333; // 最多8字节  不加f默认是double类型
        System.out.println(f1);
        System.out.println(d1);
    }
}
