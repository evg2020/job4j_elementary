package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number > 1;
        for (int i = 2; i < number; i++) {
            if (number % i == 0)  {
               prime = false;
               break;
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        System.out.print(check(22));
    }
}
/*

    public static boolean check(int number) {
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
    }
*/







