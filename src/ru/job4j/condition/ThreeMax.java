package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int res = first;
        if (first > second && first > third) {
            res = second;
        }
        if ( second > first && second > third) {
            res = third;
        }
        return res;
    }
    public static void main(String[] args) {
        int result = max(1, 2, 3)
        System.out.println(result);
    }
}
