package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> data = new ArrayList<Integer>(20);
        ArrayList<Integer> odd3 = new ArrayList<Integer>(0);
        ArrayList<Integer> odd2 = new ArrayList<Integer>(0);
        ArrayList<Integer> other = new ArrayList<Integer>(0);

        for (int i = 0; i < 20; i++) {
            String s = br.readLine();
            data.add(Integer.parseInt(s));
        }

        for (int i = 0; i < data.size(); i++) {
            Integer x = data.get(i);
            if (x % 3 == 0) odd3.add(x);
            if (x % 2 == 0) odd2.add(x);
            if (!((x % 3 == 0) | (x % 2 == 0))) other.add(x);
        }

        printList(odd3);
        printList(odd2);
        printList(other);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (Integer i: list) {
            System.out.println(i);
        }    
    }
}