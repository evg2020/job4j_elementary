package ru.job4j.calculator;

public class Fit1 {
    public static void manWeight(float height) {
        double idealWeigth = (height - 100) * 1.15;
        System.out.println(idealWeigth);
    }

    public static void main(String[] args){
        float height = 174;
        Fit1.manWeight(height);
    }
}
