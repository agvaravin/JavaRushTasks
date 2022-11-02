package com.javarush.task.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Описываем числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s= reader.readLine();
        int l = s.length();
        int n = Integer.parseInt(s);
        if (n < 1 || n > 999) return;
        if ((n % 2) == 0) s = "четное "; else s = "нечетное ";
        if (l == 1) s = s + "однозначное ";
        if (l == 2) s = s + "двузначное ";
        if (l == 3) s = s + "трехзначное ";
        System.out.println(s + "число");
    }
}
