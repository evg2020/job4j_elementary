package ru.job4j;

public class Converter {
   public static float rubleToEuro(float value) {
       float rst = value / 70;
       return rst;
   }

    public static float rubleToDollar(float value) {
        float rst = value / 60;
        return rst;
    }
        public static void main(String[] args) {
       float value =140;
            float dollar = Converter.rubleToDollar(value);
            float euro = Converter.rubleToEuro(value);
            System.out.println("Rub " + value+"----"+"Dollars " + dollar);
            System.out.println("Rub " + value+"----"+"Euro " + euro);

        }

}
