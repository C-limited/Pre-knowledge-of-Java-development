package com.itheima;

public class Car {
    private String name;
    private double price;

    public Car(String name, double price){
        // this代表了当前对象
        this.name = name;
        this.price = price;
    }

    public void goWith(String name){
        System.out.println(this);
        // 谁调用这个方法，this就代表谁
        System.out.println(this.name +
                "正在和" + name + "比赛~");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
