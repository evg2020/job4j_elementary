package ru.job4j.ru.javabook;

public class DooBee {
    public static void main(String[] args) {
        int x = 1;
        while (x < 6) {
            System.out.println("Doing");
            System.out.println("x = " +  x);
            x = x + 1;
        }

         if (x == 6) {
            System.out.println("Done");
        }
    }
}
