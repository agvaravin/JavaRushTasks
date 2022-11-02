package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            strings.add(br.readLine());
        }

        int min = 10000;
        int max = 0;

        for (String string : strings) {
            if (string.length() < min) {
                min = string.length();
            }if (string.length() > max) {
                max = string.length();
            }
        }

        for (String string : strings) {
            if ((string.length() == min) | (string.length() == max)) {
                System.out.println(string);
                return;
            }
        }
    }
}
