package com.javarush.task.task07.task0706;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] bildings = new int[15];

        for (int i = 0; i < bildings.length; i++) {
            bildings[i] = Integer.parseInt(br.readLine());
        }

        int sumOdd = 0; //нечетное
        int sumEven = 0;

        for (int i = 0; i < bildings.length; i = i + 2) {
            sumEven += bildings[i];
        }

        for (int i = 1; i < bildings.length; i = i + 2) {
            sumOdd += bildings[i];
        }

        String res = " нечетными ";

        if (sumOdd < sumEven) {
            res = " четными ";
        }

        if (sumOdd != sumEven) {
            System.out.println("В домах с" + res + "номерами проживает больше жителей.");
        }
    }
}
