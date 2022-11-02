package com.javarush.task.task04.task0436;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Рисуем прямоугольник
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b ; j++) {
                System.out.print("8");
            }
            System.out.println();
        }

    }
}
