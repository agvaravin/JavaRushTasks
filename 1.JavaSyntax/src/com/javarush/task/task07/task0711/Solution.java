package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            strings.add(br.readLine());
        }

        for (int i = 0; i < 13; i++) {

            strings.add(0, strings.get(strings.size() - 1));
            strings.remove(strings.size() - 1);
        }

        for (String string : strings) {
            System.out.println(string);
        }

    }

}
