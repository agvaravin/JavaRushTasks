package com.javarush.task.task04.task0441;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Как-то средненько
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n0 = Integer.parseInt(reader.readLine());
        int n1 = Integer.parseInt(reader.readLine());
        int n2 = Integer.parseInt(reader.readLine());
        if ((n0>=n1 && n0<=n2) || (n0<=n1 && n0>=n2)) System.out.println(n0);
        else if ((n1>=n0 && n1<=n2) || (n1<=n0 && n1>=n2)) System.out.println(n1);
        else System.out.println(n2);

    }
}
