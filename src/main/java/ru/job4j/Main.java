package ru.job4j;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = index;
        }
        String space = "";
        for (int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index]);
        }
        }
    }
