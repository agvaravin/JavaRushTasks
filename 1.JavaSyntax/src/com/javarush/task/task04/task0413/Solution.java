package com.javarush.task.task04.task0413;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
День недели
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int n = Integer.parseInt(s);
        if ((n < 1) | (n > 7)) s ="такого дня недели не существует";
        if (n == 1) s = "понедельник";
        if (n == 2) s = "вторник";
        if (n == 3) s = "среда";
        if (n == 4) s = "четверг";
        if (n == 5) s = "пятница";
        if (n == 6) s = "суббота";
        if (n == 7) s = "воскресенье";
        System.out.println(s);

    }
}