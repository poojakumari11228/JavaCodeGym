package com.codegym.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set of cats

*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //write your code here. step 3
        Iterator<Cat> iterator = cats.iterator();
        if (iterator.hasNext())
            cats.remove(iterator.next());

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //write your code here. step 2
        Set<Cat> hashSet = new HashSet<Cat>();

        Cat c1 = new Cat();
        Cat c2 = new Cat();
        Cat c3 = new Cat();

        hashSet.add(c1);
        hashSet.add(c2);
        hashSet.add(c3);

        return hashSet;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4
        for (Cat c : cats)
            System.out.println(c);
    }

    // step 1
    public static class Cat{

         Cat(){

        }
    }
}
