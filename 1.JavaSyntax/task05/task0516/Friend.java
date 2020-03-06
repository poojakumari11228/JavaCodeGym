package com.codegym.task.task05.task0516;

/* 
You can't buy friends

*/

public class Friend {
    //write your code here
    String name;
    int age;
    char sex;

    public Friend(String  name)
    {
        this.name = name;
        this.age=12;
        this.sex='M';
    }

    public Friend(String name, int age)
    {
        this.name = name;
        this.age = age;
        this.sex='M';
    }

    public Friend(String name, int age, char sex)
    {
        this.name= name;
        this.age= age;
        this.sex = sex;
    }

    public static void main(String[] args) {

    }
}
