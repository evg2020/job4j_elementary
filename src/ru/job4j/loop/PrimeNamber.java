package ru.job4j.loop;

public class PrimeNamber {
    public static int calc(int finish) {
        int count = 0;
        for (int i = 2; i <= finish; i++) {
            if (CheckPrimeNumber.check(i)) {
                count = count + 1;
            }
        }
        return count;
    }
    
        public static void main(String[] args) {
        System.out.print(calc(100));
    }
}
