package com.itheima.d2_polymorphic_advantage;

public class Test {
    public static void main(String[] args) {
        Animal d = new Dog();
        go(d);
        // d.lookDoor();

        Animal t = new Tortoise();
        go(t);
    }

    /**
       希望这个方法可以接收一切子类动物对象
     * @param a
     */
    /**在这个代码中，参数a是在go方法中定义的Animal类型的形参。这个参数的作用是用来接收传入go方法的Animal对象，然后调用这个对象的run方法。

     由于Java中的方法重写机制，当Animal的子类对象被传入go方法时，实际调用的是该子类的run方法。这种特性被称为多态（Polymorphism），
     允许程序在运行时动态地选择调用哪个方法，而不是在编译时就确定。

     通过将参数类型定义为Animal类型，可以使go方法接受任何Animal的子类对象作为参数。这种灵活性可以使程序更加通用和可扩展，因为当新的Animal子类被添加时，
     它们可以被传递到go方法中，而无需修改go方法的定义。**/
    public static void go(Animal a){
        System.out.println("预备~~~");
        a.run();
        System.out.println("结束~~~~");
    }
}
