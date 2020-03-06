package com.codegym.task.task05.task0517;

/* 
Creating cats

*/

public class Cat {
    //write your code here
    String name,address,color;
    int age,weight;

    public Cat(String name)
    {
        this.name= name;
        this.age = 12;
        this.color = "red";
        this.weight = 23;
    }

    public Cat(String name,int weight, int age)
    {
        this.name= name;
        this.age = age;
        this.color = "red";
        this.weight = weight;
    }
    public Cat(String name, int age)
    {
        this.name= name;
        this.age = age;
        this.color = "red";
        this.weight = 23;
    }
    public Cat(int weight,String color)
    {
        this.age = 12;
        this.color = color;
        this.weight = weight;
    }

    public Cat(int weight,String color,String address)
    {
        this.age = 12;
        this.color = color;
        this.weight = weight;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
