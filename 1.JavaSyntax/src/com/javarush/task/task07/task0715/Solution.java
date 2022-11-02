package com.javarush.task.task07.task0715;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> massive = new ArrayList();
        massive.add("мама");
        massive.add("мыла");
        massive.add("раму");
        massive.add(1, "именно");
        massive.add(3, "именно");
        massive.add(5, "именно");

        for (int i = 0; i < massive.size(); i++) {
            System.out.println(massive.get(i));
        }
    }
}
