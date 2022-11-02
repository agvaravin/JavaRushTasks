package com.javarush.task.task04.task0420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Сортировка трех чисел
*/


public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(reader.readLine());
        int n2 = Integer.parseInt(reader.readLine());
        int n3 = Integer.parseInt(reader.readLine());
        int m = n1;
        if (n1 < n2) {m = n1; n1 = n2; n2 = m;}
        if (n1 < n3) {m = n1; n1 = n3; n3 = m;}
        if (n2 < n3) {m = n2; n2 = n3; n3 = m;}
        System.out.println(n1 + " " + n2 + " " + n3);
    }

}
