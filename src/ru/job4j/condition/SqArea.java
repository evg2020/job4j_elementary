package ru.job4j.condition;

public class SqArea {
    public static double square ( double p, double k) {
        double length = p * k / (2 * k + 2);
        double height = length / k;
        return length * height;
    }
    public static void main (String[] args) {
        double result = SqArea.square(4, 1);
        System.out.println("Square  equal = " + result);
    }
}
