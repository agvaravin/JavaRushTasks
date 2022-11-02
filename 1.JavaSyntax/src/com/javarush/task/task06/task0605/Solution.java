package com.javarush.task.task06.task0605;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Контролируем массу тела
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateMassIndex(weight, height);
    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            // напишите тут ваш код
            double massIndex = weight / (height * height);
            String resultStr = "";
            if (massIndex < 18.5) resultStr = "Недовес: меньше чем 18.5";
            if ((massIndex >= 18.5) & (massIndex < 25)) resultStr = "Нормальный: между 18.5 и 25";
            if ((massIndex >= 25) & (massIndex < 30)) resultStr = "Избыточный вес: между 25 и 30";
            if (massIndex >= 30) resultStr = "Ожирение: 30 или больше";
            System.out.println(resultStr);
        }
    }
}
