package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("мера");
        strings.add("лоза");
        strings.add("лира");
        strings.add("вода");
        strings.add("упор");

        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код
        int i = 0;
        while (true) {
            if (i >= strings.size()) break;
            String s = strings.get(i);
            if (s.contains("р")) {
                if (s.contains("л")) { i++; continue; }
                strings.remove(i);
                continue;
            }
            if (s.contains("л")) {
                if (s.contains("р")) {i++; continue; }
                strings.add(i, s);
                i++;
            }
            i++;
        }
        return strings;
    }
}