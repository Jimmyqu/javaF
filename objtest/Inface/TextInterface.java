package javaF.objtest.Inface;

// 类同接口是不同的 接口中无构造器
public interface TextInterface {
    // 只有常量 和抽象方法
    public static final double Pi = 3.14;
    public abstract void say();
    public abstract void call(int num);
}

interface TextInterface01 {
    // 只有常量 和抽象方法
    public abstract void sleep(int num);
}


// 类只能直接继承单个父类 但是可以实现多个接口
// 类用来实现接口
class Students implements TextInterface, TextInterface01 {
    @Override
    public void say() {
        System.out.printf("say");
    }

    @Override
    public void call(int num) {
        System.out.printf("" + num);
    }

    @Override
    public void sleep(int num) {

    }
}