package com.joyfully.ExtendLearn.Constructor;
/*
super关键字的用法有三种：
1. 在子类的成员方法中，访问父类的成员变量。
2. 在子类的成员方法中，访问父类的成员方法。
3. 在子类的构造方法中，访问父类的构造方法。
 */
public class Zi extends Fu {

    public Zi() {
        super(); // 在调用父类无参构造方法
//        super(20); // 在调用父类重载的构造方法
        System.out.println("子类构造方法！");
    }

    public void method1() {
//        super(); // 错误写法！只有子类构造方法，才能调用父类构造方法。
    }
    
    int num = 20;

//    public Zi() {
//        super();
//    }

    public void methodZi() {
        System.out.println(super.num); // 父类中的num
    }

    public void method() {
        super.method(); // 访问父类中的method
        System.out.println("子类方法");
    }
}
