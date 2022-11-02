package com.javarush.task.task08.task0813;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static Set<String> createSet() {
        //напишите тут ваш код
        Set<String> stringSet = new HashSet<String>();
        String[] str = {"Лист","Люк","Лак","Лоб","Лик","Латы","Лобио","Леер","Лес","Лупа",
                "Лень","Любовь","Лакан","Лук","Лед","Лейка","Лобок","Лярва","Лайк","Лешик"};

        for (int i = 0; i < 20; i++) {
            stringSet.add(str[i]);
        }
        return stringSet;
    }

    public static void main(String[] args) {

    }
}
