package javaF.work;
import java.util.Scanner;

public class PisaFactory {

    public static Pisa getPisa(int choice){
        Scanner scan = new Scanner(System.in);
        int size = 0;int price = 0;int kis = 0;String add="";

        if(choice == 0){
            System.out.printf("请输入要加的水果");
            if(scan.hasNext()) {
                add = scan.next();
            }
        }else {
            System.out.printf("请输入要加多少肉");
            if(scan.hasNext()) {
                kis = scan.nextInt();
            }
        }

        System.out.printf("请输入披萨大小");
        if(scan.hasNext()) {
            size = scan.nextInt();
        }
        System.out.printf("请输入披萨价格");
        if(scan.hasNext()) {
            price = scan.nextInt();
        }

        if(choice == 0){
            return new FruitPisa("水果披萨", price, size, add);
        }else {
            return new MeatPisa("肉披萨", price, size, kis);
        }
    }
}
