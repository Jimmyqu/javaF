package javaF.objtest.JiChen;

// 对象3特性 封装 继承 多态
// 继承
// 类是对象的抽象 继承是对类的抽象
public class PersonJiChen {
    public Boolean sex;
//    private int age; // 外界无法直接访问 子类也不行
    public int age;
    public String name;

    // 重载 让 new PersonJiChen() 不带参数可用
    public PersonJiChen() {}

    public PersonJiChen(String name, int age, Boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void getPersonInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.sex);
    }
}