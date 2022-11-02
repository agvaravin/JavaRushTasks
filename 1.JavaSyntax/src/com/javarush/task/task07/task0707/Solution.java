package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        String[] input = {"один","два","три", "четыре", "пять"};

        for (String s : input) {
            list.add(s);
        }

        System.out.println(list.size());

        for (String s : list) {
            System.out.println(s);
        }
    }
}
