package com.itheima;

public class Test {
    public static void main(String[] args) {
        // 创建对象
        Student s = new Student();
        s.setName("张三");
        s.setAge(23);
        s.setSex('男');
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getSex());

        Student s2 = new Student("李四", 24, '男');
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
        System.out.println(s2.getSex());

    }
}
