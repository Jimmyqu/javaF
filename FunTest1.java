import java.util.Arrays;
import java.util.Scanner;

public class FunTest1 {
   public static void main(String[] args) {
      int [] arr = {21,32,3,44};

      // findMax(arr);
      // addToArr(88, 0, arr);
      // remove(99, arr);
      changeArgs(0); //[0]
      changeArgs(0); //[0]
      changeArgs(new int[] {1,2,3,4}); //[1,2,3,4]
      changeArgs(); //[]
   }

   public static void findMax(int[] arr){
      int max = arr[0];
      for(int i= 0; i< arr.length; i++) {
         if(max < arr[i]){
            max = arr[i];
         }
      }
      System.out.println(max);
   }

   // [1,2,3,4]
   public static void addToArr(int num, int index, int[] arr){
      for(int i= 0; i< arr.length; i++) {
         if(index == i) {
            arr[i+1] = arr[i];
            arr[i] = num;
         }
      }
      System.out.println(Arrays.toString(arr));
   }

   // [1,2,3,4,5]
   public static void remove(int num, int[] arr){
      int index = -1;
      for(int i= 0; i< arr.length; i++) {
         if(num == arr[i]) {
            index = i;
         }
      }
      if(index != -1) {
         for(int j = index; j<arr.length-1; j++) {
            System.out.println(j);
            arr[j] = arr[j+1];
         }
         arr[arr.length-1] = 0;
      }


      System.out.println(Arrays.toString(arr));
   }

   // 可变参数
   public static void changeArgs(int ...num) {
      System.out.println(Arrays.toString(num));
   }
}
