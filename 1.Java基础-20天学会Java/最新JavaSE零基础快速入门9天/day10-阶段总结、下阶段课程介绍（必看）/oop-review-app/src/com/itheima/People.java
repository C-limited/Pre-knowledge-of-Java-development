package com.itheima;

public class People {
    // 1、成员变量私有化（合理隐藏）
    // private修饰的东西只能在本类中访问，其他类中不能访问
    private int age;

    // 2、提供公开化的getter setter方法（合理暴露）
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
         this.age = age;
    }
}
