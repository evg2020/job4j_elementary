package ru.job4j.condition;

public class MultiMax {
    public static int multiMax(int a, int b, int c) {
       /* int res = a;
        if (a > b) {
            res = a;
        } else if (b > c) {
            res = b ;
        }
        return c;*/
        int res = Math.max(a, Math.max(b, c));
        return res;
    }

    public static void main(String[] args) {
        int res = multiMax(-23, -23, -2);
        System.out.println("Max of 3 number = " + res);
    }
}
