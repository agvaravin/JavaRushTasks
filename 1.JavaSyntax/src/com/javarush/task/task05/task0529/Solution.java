package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String s;
        int n = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (!"сумма".equals(s = reader.readLine())) {
            n += Integer.parseInt(s);
        }
        System.out.println(n);
    }
}
