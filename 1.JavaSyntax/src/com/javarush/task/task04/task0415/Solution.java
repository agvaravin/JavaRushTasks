package com.javarush.task.task04.task0415;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Правило треугольника
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int l1 = Integer.parseInt(reader.readLine());
        int l2 = Integer.parseInt(reader.readLine());
        int l3 = Integer.parseInt(reader.readLine());
        if (((l1 < (l2 + l3)) & (l2 < (l1 + l3))) & (l3 < (l2 + l1)))
            System.out.println("Треугольник существует.");
        else
            System.out.println("Треугольник не существует.");
    }
}