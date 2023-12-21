package ru.job4j.condition;

public class Abc {
    public static void main(String[] args) {
        int a = 1;
        int b = 9;
        int c = 51;

        if (a >= b && a >= c) {
            System.out.println("Максимальное число А.");
        } else if (b >= c) {
            System.out.println("Максимальное число В.");
        } else {
            System.out.println("Максимальное число С.");
        }
    }
}