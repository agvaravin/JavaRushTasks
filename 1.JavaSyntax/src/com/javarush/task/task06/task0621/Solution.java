package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Cat catGpa = new Cat(reader.readLine(), null, null);
        Cat catGma = new Cat(reader.readLine(), null, null);
        Cat catPa = new Cat(reader.readLine(), catGpa, null);
        Cat catMa = new Cat(reader.readLine(), null, catGma);
        Cat catDaughter = new Cat(reader.readLine(), catPa, catMa);
        Cat catSon = new Cat(reader.readLine(), catPa, catMa);

        System.out.println(catGpa);
        System.out.println(catGma);
        System.out.println(catPa);
        System.out.println(catMa);
        System.out.println(catDaughter);
        System.out.println(catSon);
    }

    public static class Cat {
        private String name;
        private Cat father = null;
        private Cat mother = null;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat father, Cat mother) {
            this.name = name;
            this.father = father;
            this.mother = mother;
        }

        @Override
        public String toString() {

            String strResult = "The cat's name is " + name;

            if (mother == null)
                strResult = strResult + " , no mother";
            else
                strResult = strResult + ", mother is " + mother.name;

            if (father == null)
                strResult = strResult + " , no father";
            else
                strResult = strResult + ", father is " + father.name;

            return strResult;
        }
    }
}
