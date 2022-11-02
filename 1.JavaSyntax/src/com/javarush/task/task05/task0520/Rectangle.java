package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    //напишите тут ваш код
    private int top;
    private int left;
    private int width;
    private int height;

    public Rectangle(int top, int left){
        this.top = top;
        this.left = left;
        this.width = 5;
        this.height = 5;
    }
    public Rectangle(int top, int left, int qua){
        this.top = top;
        this.left = left;
        this.width = qua;
        this.height = qua;
    }
    public Rectangle(int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    public Rectangle(int qua){
        this.top = 1;
        this.left = 1;
        this.width = qua;
        this.height = qua;
    }

    public static void main(String[] args) {

    }
}
