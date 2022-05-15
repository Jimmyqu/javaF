import java.util.Arrays;

public class FunTest2 {
   public static void main(String[] args) {
      int [][] arr ={{1,2,3}, {3,4,5}, {5,6,7}};
      for(int[] a :arr){
         for(int b: a) {
            System.out.print(b);
         }
         System.out.println();
      }
   }

}
