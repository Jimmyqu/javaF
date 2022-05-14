import java.util.Scanner;

public class FunTest {
   public static void main(String[] args) {
      // 动态初始化 定义和分配空间赋值 分开进行
      int[] arr = new int [4]; // 默认初始化
      arr[0] = 1; 
      arr[1] = 2;
      arr[2] = 3;
      arr[3] = 4;
      for(int i: arr) {
         System.out.println(i);
      }

      //静态初始化 定义数组同时 初始化
      int [] arr1 = { 1,2,3,4};
      // int [] arr1 = new int[] { 1,2,3,4};
      for(int i: arr1) {
         System.out.println(i);
      }
   }
}
