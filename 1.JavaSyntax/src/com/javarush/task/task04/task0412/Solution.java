package com.javarush.task.task04.task0412;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительное и отрицательное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        String s  = reader.readLine();
        n = Integer.parseInt(s);
        if (n < 0)
            n = n + 1;
        if (n > 0)
            n = n * 2;
        System.out.println(n);
    }

}