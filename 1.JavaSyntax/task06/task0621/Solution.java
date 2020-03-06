package com.codegym.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Cat relations

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String GrandfatherName = reader.readLine();
        Cat catGrandfather = new Cat(GrandfatherName,null,null);
        System.out.println(catGrandfather.toString());

        String GrandmotherName = reader.readLine();
        Cat catGrandmother = new Cat(GrandmotherName,null,null);
        System.out.println(catGrandmother.toString());

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName,null,catGrandfather);
        System.out.println(catFather.toString());

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName,catGrandmother,null);
        System.out.println(catMother.toString());

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);
        System.out.println(catSon.toString());

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);
        System.out.println(catDaughter.toString());



    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {
            if (mother == null && father == null)
                return "The cat's name is " + name + ", no mother, no father";
            else if (father == null)
                return "The cat's name is " + name + ", " + mother.name + " is the mother, no father";
            else if (mother == null)
                return "The cat's name is " + name + ", no mother, "+ father.name + " is the father";
            else
                return "The cat's name is " + name + ", " + mother.name + " is the mother , "+ father.name + " is the father";
        }
    }

}
