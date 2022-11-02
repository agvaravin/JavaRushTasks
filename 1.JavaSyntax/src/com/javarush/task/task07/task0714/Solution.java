package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            String s = br.readLine();
            strings.add(s);
        }

        strings.remove(2);

        for (int i = strings.size(); i >0; i--) {
            System.out.println(strings.get(i-1));
        }

    }
}
