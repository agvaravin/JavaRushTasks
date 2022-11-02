package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int f = 0;
        if (this.age > anotherCat.age) f++;
        if (this.age < anotherCat.age) f--;
        if (this.strength > anotherCat.strength) f++;
        if (this.strength < anotherCat.strength) f--;
        if (this.weight > anotherCat.weight) f++;
        if (this.weight < anotherCat.weight) f--;
        return (f>0);
    }

    public static void main(String[] args) {

    }
}
