package com.codegym.task.task08.task0824;

/* 
Make a family

*/

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Human child1 = new Human("child1",true,2,new ArrayList<Human>());
        Human child2 = new Human("child2",true,2,new ArrayList<Human>());
        Human child3 = new Human("child3",true,2,new ArrayList<Human>());

        ArrayList<Human> children = new ArrayList<Human>(Arrays.asList(child1,child2,child3));

        Human father = new Human("Father",true,30,children);
        Human mother = new Human("Mother",false,30,children);

        Human grandfather = new Human("GrandFather",true,30,new ArrayList<Human>(Arrays.asList(father)));
        Human grandmother = new Human("GrandMother",false,30,new ArrayList<Human>(Arrays.asList(father)));

        Human grandfather2 = new Human("GrandFather2",true,30,new ArrayList<Human>(Arrays.asList(mother)));
        Human grandmother2 = new Human("GrandMother2",false,30,new ArrayList<Human>(Arrays.asList(mother)));

        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());

        System.out.println(father.toString());
        System.out.println(mother.toString());

        System.out.println(grandfather.toString());
        System.out.println(grandfather2.toString());
        System.out.println(grandmother.toString());
        System.out.println(grandmother2.toString());

    }

    public static class Human {
        //write your code here
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.age = age;
            this.children = children;
        }

        Human(){

        }


        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", children: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
