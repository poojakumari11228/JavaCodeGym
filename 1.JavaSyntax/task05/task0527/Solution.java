package com.codegym.task.task05.task0527;

/* 
Tom and Jerry

*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);

        //write your code here
        Mouse jerryMouse2 = new Mouse("Jerry", 12, 5);

        Cat tom = new Cat("Tom", 12, 5);
        Cat tom2 = new Cat("Tom", 12, 5);

        Dog jack = new Dog("jack", 12, 5);
        Dog jack2 = new Dog("jack", 12, 5);


    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    //write your code here
    public static class Cat {
        String name;
        int height;
        int tail;

        public Cat(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog {
        String name;
        int height;
        int tail;

        public Dog(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
}
