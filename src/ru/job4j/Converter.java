package ru.job4j;

public class Converter {
   public static float rubleToEuro(float value) {
             return  value / 70;
   }

    public static float rubleToDollar(float value) {
                return value / 60;
    }

        public static void main(String[] args) {
       float value = 140;
            float dollar = Converter.rubleToDollar(value);
            float euro = Converter.rubleToEuro(value);
            float expetedEuro = value / 70;
            float expetedDollar = value / 60;
            boolean passedEuro = expetedEuro == euro;
            boolean passedDollar = expetedDollar == dollar;
            System.out.println("Rub " + value + "----" + "Dollars " + dollar + " ; " + passedDollar);
            System.out.println("Rub " + value + "----" + "Euro " + euro + " ; " + passedEuro);

        }

}
