package ru.job4j.loop;

public class Factorial {
    @SuppressWarnings("checkstyle:MethodParamPad")
    public static int calculate(int number) {
        int result = 1;
        for (int f = 1; f <= number; f++) {
            result = result * f;
        }
        return result;
    }
}
