package ru.job4j.loop;

public class MortGage {
    public static int years(int amount, int salary, int percent) {
        int years = 0;
        int sum = amount * (100 + percent) / 100;
        while (sum >= 0) {
            sum = sum - salary;
            sum = sum * (100 + percent) / 100;
            years = years + 1;
        }
        return years;
    }

        public static void main(String[] args) {
        System.out.print(years(100, 70, 50));
    }

}
