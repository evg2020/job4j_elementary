package ru.job4j;


public class Converter {

    public static int rubleToEuro(int value) {
                return value / 70;
    }



    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
    }
}