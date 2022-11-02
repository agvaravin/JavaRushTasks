package com.javarush.task.task04.task0414;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Количество дней в году
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int y = Integer.parseInt(s);
        s = "365";
        if ((y % 400) == 0) s = "366";
            else if ((y % 100) == 0) s = "365";
                else if ((y % 4) == 0) s = "366";
        System.out.println("количество дней в году: " + s);
    }
}