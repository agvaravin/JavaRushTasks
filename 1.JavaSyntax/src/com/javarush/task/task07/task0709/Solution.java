package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            strings.add(br.readLine());
        }

        int min = 10000;

        for (String string : strings) {
            if (string.length() < min) {
                min = string.length();
            }
        }

        for (String string : strings) {
            if (min == string.length()) {
                System.out.println(string);
            }
        }
    }
}
