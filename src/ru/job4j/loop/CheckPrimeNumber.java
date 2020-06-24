package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean number > 1;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                boolean prostoNumber = false
                break;
            }
        }
        return prostoNumber;
    }

    public static void main(String[] args) {
        System.out.print(check(11));
    }
}

 /* public static boolean check(int number) {
        boolean prostoNumber = false;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                if (i == number) {
                    prostoNumber = true;
                }
                break;
            }
        }
        return prostoNumber;
    }*/





