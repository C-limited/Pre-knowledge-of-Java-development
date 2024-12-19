package com.itheima;

public class Student {
    // 成员变量
    private String name;
    private int age;
    private char sex;


    public Student() {
        System.out.println("无参数构造器执行");
    }

    public Student(String name, int age, char sex) {
        System.out.println("有参数构造器执行");
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
