package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man o1 = new Man("Igor", 12, "Rostov");
        Man o2 = new Man("Denis", 13, "Moskva");
        Woman o3 = new Woman("Igor", 12, "Rostov");
        Woman o4 = new Woman("Igor", 12, "Rostov");
        System.out.println(o1.toString());
        System.out.println(o2.toString());
        System.out.println(o3.toString());
        System.out.println(o4.toString());

    }

    //напишите тут ваш код
    public static class Man {
        private String name;
        private int age;
        private String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Man() {
            this("Noname", 30,"No address");
        }

        public String toString() {
            return this.name + " " + this.age + " " + this.address;
        }
    }
    public static class Woman {
        private String name;
        private int age;
        private String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Woman() {
            this("Noname", 30,"No address");
        }

        public String toString() {
            return this.name + " " + this.age + " " + this.address;
        }
    }
}
