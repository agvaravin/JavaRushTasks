package com.javarush.task.task04.task0416;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float m = Float.parseFloat(reader.readLine());
        m = m % 5;
        if (m < 3) System.out.println("зеленый");
        else if (m < 4) System.out.println("желтый");
        else if (m < 5) System.out.println("красный");
    }
}