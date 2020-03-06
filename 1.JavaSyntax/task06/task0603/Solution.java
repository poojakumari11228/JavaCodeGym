package com.codegym.task.task06.task0603;

/* 
Cat and Dog objects: 50,000 each

*/

public class Solution {
    public static void main(String[] args) throws Throwable {
        // write your code here
        Cat cat = null;
        Dog dog = null;
        for(int i=1; i<=50000; i++)
        {
            cat = new Cat();
            dog = new Dog();
        }
        cat.finalize();
        dog.finalize();
        
    }
}

class Cat {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Cat was destroyed");
    }
}

class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Dog was destroyed");
    }
}
