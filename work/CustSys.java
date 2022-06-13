package javaF.work;

import java.util.Scanner;

public class CustSys {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int type = 0;
        System.out.printf("请选择要的披萨: 0 水果披萨 1 肉披萨");
        if(scan.hasNext()) {
            type = scan.nextInt();
        }

        Pisa p1 =  PisaFactory.getPisa(type);
        p1.getInfo();

    }
}
