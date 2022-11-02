package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] bigArray = new int[20];
        int[] firstSmallArr = new int[10];
        int[] secondSmallArr = new int[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < bigArray.length; i++) {
            bigArray[i]=Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < firstSmallArr.length; i++) {
            firstSmallArr[i] = bigArray[i];
            secondSmallArr[i] = bigArray[i+10];
            System.out.println(secondSmallArr[i]);
        }


    }

}
