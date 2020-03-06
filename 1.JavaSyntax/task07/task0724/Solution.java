package com.codegym.task.task07.task0724;

/* 
Family census

*/

public class Solution {
    public static void main(String[] args) {
        // write your code here
        Human ha = new Human("GrandFather1",true, 2); //male
        Human hb = new Human("GrandMother1",false, 22);//female
        Human hc = new Human("GrandMother2",false, 23); //female
        Human hd = new Human("GrandFather2",true, 24); //male

        Human h1 = new Human("Father",true, 2,ha,hb); //male
        Human h2 = new Human("Mother",false, 22,hd,hc); //female
        Human h3 = new Human("Child1",true, 23,h1, h2);
        Human h4 = new Human("Child2",true, 24,h1, h2);
        Human h5 = new Human("Child3",true, 24,h1, h2);

        System.out.println(ha.toString());
        System.out.println(hb.toString());
        System.out.println(hc.toString());
        System.out.println(hd.toString());

        System.out.println(h1.toString());
        System.out.println(h2.toString());
        System.out.println(h3.toString());
        System.out.println(h4.toString());
        System.out.println(h5.toString());

    }

    public static class Human {
        // write your code here
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            if (this.father != null)
                text += ", father: " + this.father.name;

            if (this.mother != null)
                text += ", mother: " + this.mother.name;

            return text;
        }
    }
}