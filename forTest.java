package javaF;

public class forTest {
//    public static void main(String [] args) {
//        for(int i = 1; i <= 9; i ++) {
//            for(int j = 1; j <= i; j ++) {
//                System.out.print(i + "*"+j +"=" + i * j +'\t');
//            }
//            System.out.println();  // 递增乘法表
//        }
//    }

//    public static void main(String [] args) {
//        for(int i = 1; i <= 4; i ++) {  // 行
//            for(int k = 1; k <= 10; k ++) { // 行前空格
//                if(i==k){
//                    for(int p=1; p < k; p++) {
//                        System.out.print(" ");
//                    }
//                }
//            }
//            for(int j = 1; j <= 9; j ++) { // 列
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

    public static void main(String [] args) {
        int count1 = 5;
        for(int p = 6; p > 0; p --) {  // 行
            count1++;
            for(int j = 1; j <= 12; j ++) { // 列
                if(j == p || j == count1) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        int count = 12;
        for(int i = 1; i <= 6; i ++) {  // 行
            count--;
            for(int j = 1; j <= 12; j ++) { // 列
                if(j == i || j == count) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
