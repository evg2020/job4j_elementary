package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height){
        double res = (height - 100) * 1.15;
        return res;
    }
    public static double womanWeight(short height) {
        double res = (height - 110) * 1.15;
        return res;
    }
        public static void main (String[]args){
            short height = 187;
            double waight = Fit.manWeight(height);
            System.out.println("Для мужиков не должен превышать " + waight + " кг"  );
            double waight1 = Fit.womanWeight(height);
            System.out.println("Для женщин шне должен превышать " + waight1 + " кг");
        }
    }



