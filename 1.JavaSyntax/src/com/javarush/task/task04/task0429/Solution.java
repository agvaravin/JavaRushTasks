package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительные и отрицательные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int pl = 0; int mn = 0;
        for (int i = 0; i < 3; i++) {
            int n = Integer.parseInt(reader.readLine());
            if (n > 0) pl++;
            if (n < 0) mn++;

        }
        System.out.println("количество отрицательных чисел: " + mn + "\nколичество положительных чисел: " + pl);
    }

    }

