package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;
        int n = Integer.parseInt(reader.readLine());
        if (n <= 0) return;
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(reader.readLine());
            if (i == 0)
                maximum = a;
            else maximum = a > maximum ? a : maximum;
        }
        //напишите тут ваш код
        System.out.println(maximum);
    }
}
