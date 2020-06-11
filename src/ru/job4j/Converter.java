package ru.job4j;

public class Converter {
   public static float rubleToEuro(int value) {
             int res = value / 70;
             return res;
   }



    public static void main(String[] args) {
        /*float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");*/
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
    }

}
