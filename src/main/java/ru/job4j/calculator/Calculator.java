package ru.job4j.calculator;

public class Calculator {
    public static void plus(int one, int two) {
        int result = one + two;
        System.out.println(result);
    }

    public static void minus(int one, int two) {
        int result = one - two;
        System.out.println(result);
    }

    public static void div(int one, int two) {
        int result = one / two;
        System.out.println(result);
    }

    public static void time(int one, int two) {
        int result = one * two;
        System.out.println(result);
    }

    public static void main(String[] args) {
        minus(5, 2);
        div(6, 2);
        plus(1, 2);
        time(4, 2);
    }
}
