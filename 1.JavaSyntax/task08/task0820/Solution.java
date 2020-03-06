package com.codegym.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Animal set

*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();

        //write your code here
        Cat c1 = new Cat();
        Cat c2 = new Cat();
        Cat c3 = new Cat();
        Cat c4 = new Cat();

        result.add(c1);
        result.add(c2);
        result.add(c3);
        result.add(c4);

        return result;
    }

    public static Set<Dog> createDogs() {
        //write your code here

        HashSet<Dog> result = new HashSet<Dog>();

        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Dog d3 = new Dog();

        result.add(d1);
        result.add(d2);
        result.add(d3);

        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //write your code here
        HashSet<Object> hashSet = new HashSet<Object>();
        for (Cat c : cats)
            hashSet.add(c);

        for (Dog d : dogs)
            hashSet.add(d);

        return hashSet;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //write your code here
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        //write your code here
        for (Object o : pets)
            System.out.println(o);
    }

    //write your code here
    public static class Cat{
        public Cat (){

        }
    }

    public static class Dog{

        public Dog (){

        }
    }
}
