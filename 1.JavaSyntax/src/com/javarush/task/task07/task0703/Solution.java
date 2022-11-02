package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] strings = new String[10];
        int[] lenghts = new int[10];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < strings.length; i++) {
            strings[i] = br.readLine();
        }

        for (int i = 0; i < lenghts.length; i++) {
            lenghts[i] =strings[i].length();
        }

        for (int lenght : lenghts) {
            System.out.println(lenght);
        }
    }
}
