package ru.job4j.condition;

public class AlertDivByZero {
    public static void main(String[] args) {
        possibleDiv(0);
        possibleDiv(-2);
    }
   /* public static void possibleDiv(int number) {
        boolean result = number == 0;
        if(result){
            System.out.println("Could not div by zero");
        }*/

    public static void possibleDiv(int number) {
        if (number == 0) {
            System.out.println(number + " Could not div by zero");
        }
         if (number < 0) {
             System.out.println(number + " This is negative number");
         }

    }
}
