package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        int s = 0;
        int c = 0;
        while ((n = Integer.parseInt(reader.readLine())) != -1) {
            c++;
            s += n;
        }
        System.out.println((float)s/c);
    }
}

