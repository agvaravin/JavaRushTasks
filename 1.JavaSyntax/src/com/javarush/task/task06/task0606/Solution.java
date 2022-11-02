package com.javarush.task.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        int inputNumber = Integer.parseInt(str);
        int nextstep = 0;
        int k = 0;
        while (inputNumber > 0) {
            nextstep = inputNumber / 10;
            k = inputNumber - (nextstep * 10);
            if ((k % 2) == 0) {
                even++;
            } else {
                odd++;
            };
            inputNumber = nextstep;
        };
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
