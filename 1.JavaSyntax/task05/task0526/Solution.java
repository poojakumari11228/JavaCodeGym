package com.codegym.task.task05.task0526;

/* 
Man and woman

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
       Man  man = new Man("Jack",20,"house#11");
       Man man2 = new Man("Tom",40,"house#22");
       System.out.println( man.name + " " + man.age + " " + man.address);
       System.out.println( man2.name + " " + man2.age + " " + man2.address);

       Woman  woman = new Woman("Jackii",20,"house#11");
       Woman woman2 = new Woman("Tomii",40,"house#22");
       System.out.println( woman.name + " " + woman.age + " " + woman.address);
       System.out.println( woman2.name + " " + woman2.age + " " + woman2.address);

    }

    //write your code here
    public static class Man{
        String name;
        int age;
        String address;

        public  Man(String name, int age,String address){
            this.address = address;
            this.age = age;
            this.name = name;

        }

    }

    public static class Woman{
        String name;
        int age;
        String address;

        public  Woman(String name, int age,String address){
            this.address = address;
            this.age = age;
            this.name = name;

        }

    }
}
