package javaF.objtest.FengZhuang;

// 对象3特性 封装 继承 多态

//封装是对类 做出自己独有的一些限制 例如 权限 格式化实例
public class Person {
    // 成员变量
    public int age;
    public String name;
    public Boolean sex;
    private int height; // 外界无法直接访问
    // 静态成员
    static String shoocl = "一办小学";

    // 重载 让 new Person() 不带参数可用
    public Person() {}

    public Person(String name, int age, Boolean sex) {
        this.name = name;
        this.setAge(age);
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 30) {
            this.age = 18;
        } else {
            this.age = age;
        }
    }
}
