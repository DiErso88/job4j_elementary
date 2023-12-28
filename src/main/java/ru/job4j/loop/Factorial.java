package ru.job4j.loop;

public class Factorial {
    public static int calculate(int number) {
        int result = 1;
        for (int f = 2; f <= number; f++) {
            result = result * f;
        }
        return result;
    }
}
