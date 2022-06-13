package javaF.collect;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        Collection c1 = new ArrayList(); // Collection是接口 要用他的实现类创建
        c1.add(1); // 只能存放引用数据类型 不能是基本数据类型 这里是自动装箱为Integer
        c1.add(2);
        c1.add(3);

        List l1 = Arrays.asList(new Integer[] {1,2,3,4});
        c1.addAll(l1);
        System.out.println(c1);

        for(Object i: c1) {
            System.out.println(i);
        }
    }
}
