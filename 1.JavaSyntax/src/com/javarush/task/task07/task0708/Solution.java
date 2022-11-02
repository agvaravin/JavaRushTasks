package com.javarush.task.task07.task0708;

//import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            strings.add(br.readLine());
        }

        int max = 0;

        for (String string : strings) {
            if (string.length() > max) {
                max = string.length();
            }
        }

        for (String string : strings) {
            if (max == string.length()) {
                System.out.println(string);
            }
        }
    }
}
