package com.javarush.task.task06.task0622;

// import com.javarush.task.task06.task0614.Cat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList nums= new ArrayList();
        int countOfIteration = 5;
        int buf;

        for (int i = 0; i < countOfIteration; i++) {
               nums.add(Integer.parseInt(reader.readLine()));
        }

        nums.sort(null);

        for (int i = 0; i < countOfIteration; i++) {
            System.out.println(nums.get(i));
        }
    }
}
