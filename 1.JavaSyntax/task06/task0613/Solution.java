package com.codegym.task.task06.task0613;

/* 
Cat and statics

*/

public class Solution {
    public static void main(String[] args) {
        // Create 10 cats
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();
        Cat cat6 = new Cat();
        Cat cat7 = new Cat();
        Cat cat8 = new Cat();
        Cat cat9 = new Cat();
        Cat cat10 = new Cat();

        // Display the value of the variable catCount
        System.out.println(Cat.catCount);
    }

    public static class Cat {
        // Create a static variable catCount
        static public int catCount;

        // Declare a constructor
        public Cat(){
            catCount++;
        }
    }
}
