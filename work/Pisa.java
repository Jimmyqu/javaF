package javaF.work;

public class Pisa {
     public String name;
     public int price;
     public int size;

    public Pisa() {}

    public Pisa(String name, int price, int size) {
        this.size = size;
        this.name = name;
        this.price = price;
    }

    public void getInfo() {
        System.out.println("名称" + this.name);
        System.out.println("价格" + this.price);
        System.out.println("大小" + this.size);
    }
}

class FruitPisa extends Pisa {
    static String name = "水果披萨";
    public String addFruit;

    public FruitPisa() {}

    public FruitPisa(String name, int price, int size, String addFruit) {
        super(name, price, size);
        this.addFruit = addFruit;
    }

    public void getInfo(){
        super.getInfo();
        System.out.println("加的水果:" + this.addFruit);
    }
}

class MeatPisa extends Pisa {
    static String name = "培根披萨";
    public int meatNum;

    public MeatPisa() {}

    public MeatPisa(String name, int price, int size, int meatNum) {
        super(name, price, size);
        this.meatNum = meatNum;
    }

    public void getInfo(){
        super.getInfo();
        System.out.println("肉多少:" + this.meatNum);
    }
}

