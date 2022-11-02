package com.javarush.task.task04.task0417;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Существует ли пара?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(reader.readLine());
        int n2 = Integer.parseInt(reader.readLine());
        int n3 = Integer.parseInt(reader.readLine());
        String s = "";
        if ((n1 == n2) & (n1 == n3)) s = n1 + " " + n2 + " " + n3;
        else if (n1 == n2) s = n1 + " " + n2;
        else if (n1 == n3) s = n1 + " " + n3;
        else if (n2 == n3) s = n2 + " " + n3;

        if (! ("".equals(s))) System.out.println(s);


    }
}