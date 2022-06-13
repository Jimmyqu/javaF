package javaF.collect;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List; // list在java中是个接口 需要具体实现

public class Test02 {
    public static void main(String[] args) {
        List arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(0,0);
        arr1.set(1,2);
        arr1.add(3);
        arr1.add("abd");
        arr1.remove(2);
        arr1.remove("abc"); // 非integer时 删除元素
        arr1.get(0); //index
        System.out.println(arr1);
    }
}
