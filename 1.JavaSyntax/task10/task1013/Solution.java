package com.codegym.task.task10.task1013;

/* 
Human class constructors

*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Write your variables and constructors here
        private String name;
        private int age;
        private Human father;
        private Human mother;
        private Human sister;
        private Human brother;

        public Human(String name){
            this.name = name;
        }
        public Human(String name, int age){
            this.name = name;
            this.age = age;
        }
        public Human(String name, Human father){
            this.name = name;
            this.father = father;
        }
        public Human(String name, Human father, Human mother){
            this.name = name;
            this.father = father;
            this.mother = mother;
        }
        public Human(String name, Human father, Human mother, Human sister){
            this.name = name;
            this.father = father;
            this.mother = mother;
            this.sister = sister;
        }
        public Human(String name, Human father, Human mother, Human sister,Human brother){
            this.name = name;
            this.father = father;
            this.mother = mother;
            this.sister = sister;
            this.brother = brother;
        }

        public Human(String name, int age, Human father){
            this.name = name;
            this.age = age;
            this.father = father;
        }

        public Human(String name, int age, Human father, Human mother){
            this.name = name;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
        public Human(String name, int age, Human father, Human mother, Human sister){
            this.name = name;
            this.age = age;
            this.father = father;
            this.mother = mother;
            this.sister = sister;
        }

        public Human(String name, int age, Human father, Human mother, Human sister, Human brother){
            this.name = name;
            this.age = age;
            this.father = father;
            this.mother = mother;
            this.sister = sister;
            this.brother = brother;
        }


    }
}
