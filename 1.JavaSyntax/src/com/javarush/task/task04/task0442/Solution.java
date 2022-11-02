package com.javarush.task.task04.task0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int n = 0;
        int s = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (n != -1)
            s += n = Integer.parseInt(reader.readLine());
        System.out.println(s);
    }
}
