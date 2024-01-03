package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 1;
        double surplus = amount + (amount * (percent / 100));
        while (salary < surplus) {
            surplus -= salary;
            year++;
        }
        return year;
    }
}