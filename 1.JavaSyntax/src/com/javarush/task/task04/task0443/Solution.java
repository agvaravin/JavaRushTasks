package com.javarush.task.task04.task0443;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Как назвали, так назвали
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n = reader.readLine();
        String y = reader.readLine();
        String m = reader.readLine();
        String d = reader.readLine();
        System.out.println("Меня зовут "+n+".\nЯ родился "+d+'.'+m+'.'+y);
    }
}
